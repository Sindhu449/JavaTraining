package com.Infinite.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class LibraryDAO {
	  
	
	//UpdateBook 
	
	public String updateBook(String cmpId) throws ClassNotFoundException, SQLException {
		Books bookNew = new Books();
		if(cmpId != null) {
			String sql = "update books set name=?, author=?, edition=?, dept=?, noOfBooks=? where id=?";
			Connection connection = ConnectionHelper.getConnection();
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, bookNew.getName());
			pst.setString(2, bookNew.getAuthor());
			pst.setString(3, bookNew.getEdition());
			pst.setString(4, bookNew.getDept());
			pst.setInt(5, bookNew.getNoOfBooks());
			pst.setInt(6, bookNew.getId());
			pst.executeUpdate();
			return "Book Updateded...";
		}
		return "Record not found...";
	}
	
	//AddUser
	
	public String addUser(UserCr user) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionHelper.getConnection();
		String sql= "insert into libusers(Username, Password) values(?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, user.getUserName());
		pst.setString(2, user.getPassWord());
		pst.executeUpdate();
		return "User Added";
		
	}
	
	//AddBook
	
	public String addBook(Books books) throws ClassNotFoundException, SQLException {
		int idno = generateId();
		Connection connection = ConnectionHelper.getConnection();
		String sql ="insert into Books(Id, Name, Author, Edition, Dept, TotalBooks) values(?,?,?,?,?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setInt(1, idno);
		pst.setString(2, books.getName());
		pst.setString(3, books.getAuthor());
		pst.setString(4, books.getEdition());
		pst.setString(5, books.getDept());
		pst.setInt(6, books.getNoOfBooks());
		pst.executeUpdate();
		return "Record inserted " ;
	}
	
	//generating Id 
	
	public int generateId() throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionHelper.getConnection();
		String sql = "select case when max(Id) IS NULL THEN 1 "
				+ " ELSE max(Id)+1 end Id from Books";
		PreparedStatement pst = connection.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int id = rs.getInt("Id");
		return id;
	}

	
	//History
	public List<TransReturn> history(String username) throws ClassNotFoundException, SQLException{
		Connection connection = ConnectionHelper.getConnection();
		String sql = "select * from transReturn where username=?";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, username);
		ResultSet rs = pst.executeQuery();
		TransReturn tranReturn = null;
		List<TransReturn> transReturnlist = new ArrayList<TransReturn>();
		while(rs.next()){
			tranReturn = new TransReturn();
			tranReturn.setBookId(rs.getInt("bookId"));
			tranReturn.setUserName(username);
			tranReturn.setFromdate(rs.getDate("fromDate"));
			tranReturn.setToDate(rs.getDate("toDate"));
			transReturnlist.add(tranReturn);
		}
		return transReturnlist;
		
	}
	
	//searchTranBook
	
	public TranBook searchTranBook(String user,int bookId) throws ClassNotFoundException, SQLException{
		
		Connection connection = ConnectionHelper.getConnection();
		String sql = "select * from TranBook where UserName =? and BookId=?";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		ResultSet rs = pst.executeQuery();
		TranBook tranBook = null;
		if(rs.next()){
			tranBook = new TranBook();
			tranBook.setBookId(rs.getInt("BookId"));
			tranBook.setUserName(user);
			tranBook.setFromDate(rs.getDate("FromDate"));
		}
		return tranBook;
	}
	
	//ReturnBook
	
	public String returnBooks(String user,int bookId) throws ClassNotFoundException, SQLException{
		Connection connection = ConnectionHelper.getConnection();
		TranBook tranBook = searchTranBook(user, bookId);
		String sql ="Insert into TransReturn(userName,BookId,FromDate) values(?,?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		pst.setDate(3, tranBook.getFromDate());
		pst.executeUpdate();
		sql = "Update Books set TotalBooks=TotalBooks+1 where id =?";
		pst = connection.prepareStatement(sql);
		pst.setInt(1, bookId);
		pst.executeUpdate();
		sql="Delete from TranBook where Username=? and bookId=?";
		pst = connection.prepareStatement(sql);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		pst.executeUpdate();
		return "your Book  "+bookId+" returned Successfully...";
	}
	
	//issueBooK
	
	public List<TranBook> issueBooks(String user) throws ClassNotFoundException, SQLException{
		Connection connection = ConnectionHelper.getConnection();
		String sql = "select * from TranBook where UserName = ?";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, user);
		ResultSet rs = pst.executeQuery();
		TranBook tranBook = null;
		List<TranBook> tranBookList= new ArrayList<TranBook>();
		while(rs.next()){
			tranBook = new TranBook();
			tranBook.setBookId(rs.getInt("BookId"));
			tranBook.setUserName(user);
			tranBook.setFromDate(rs.getDate("FromDate"));
			tranBookList.add(tranBook);
		}
		
		return tranBookList;
	}
	
	
	//issueOrNot
	
	public int issueOrNot(String userName,int bookId) throws ClassNotFoundException, SQLException{
		Connection connection = ConnectionHelper.getConnection();
		String sql = "select count(*) cnt from TranBook where userName = ? and Bookid=?";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, userName);
		pst.setInt(2, bookId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;
	}
	
	
	//issueBook
	
	public String issueBook(String userName,int bookId) throws ClassNotFoundException, SQLException{
		int count = issueOrNot(userName, bookId);
		if(count==0){
		Connection connection = ConnectionHelper.getConnection();
		String sql = "Insert into TranBook(UserName,BookId) values(?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, userName);
		pst.setInt(2, bookId);
		pst.executeUpdate();
		sql ="Update Books set TotalBooks= TotalBooks-1 where id=?";
		pst = connection.prepareStatement(sql);
		pst.setInt(1, bookId);
		pst.executeUpdate();
		return "Book with Id "+bookId +"Issued Successfully..";
		
		}else{
			return "Book  with Id "+bookId + " for user  "+ userName+" Already Issued..";
		}
		
	}
	
	//search Books
	
	public List<Books> searchBooks(String searchType, String searchValue) throws ClassNotFoundException, SQLException{
		String sql;
		boolean isValid=true;
		if(searchType.equals("id")){
			sql ="select * from Books where id = ? ";
		}
		else if(searchType.equals("bookname")){
			sql ="select * from Books where name = ? ";
		}else if(searchType.equals("authorname")){
			sql ="select * from Books where author = ? ";
		}else if(searchType.equals("dept")){
			sql ="select * from Books where dept = ? ";
		}
		else{
			isValid = false;
			sql = "select * from Books ";
		}
		Connection connection = ConnectionHelper.getConnection();
		PreparedStatement pst = connection.prepareStatement(sql);
				if (isValid==true) {
					pst.setString(1, searchValue);
				} 
				ResultSet rs = pst.executeQuery();
				Books books = null;
				List<Books> booksList = new ArrayList<Books>();
				while(rs.next()) {
					books = new Books();
					books.setId(rs.getInt("id"));
					books.setName(rs.getString("name"));
					books.setAuthor(rs.getString("author"));
					books.setEdition(rs.getString("edition"));
					books.setDept(rs.getString("dept"));
					books.setNoOfBooks(rs.getInt("TotalBooks"));
					booksList.add(books);
				}
				return booksList;
			}
	
	//authenticate 
	
	public int authenticate(String user, String password) throws ClassNotFoundException, SQLException{
		Connection connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from libusers where UserName=? and password=?";
		PreparedStatement pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, password);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;
	}

}