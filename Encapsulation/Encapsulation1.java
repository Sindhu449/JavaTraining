package Encapsulation;
class Account{
	private String name;
	private String email;
	private int accountno;
	private double amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}

public class Encapsulation1 {
	
	public static void main(String[] args) {
		Account a = new Account();
		
		a.setName("Hari");
		a.setEmail("hari@gmail.com");
		a.setAccountno(12346543);
		a.setAmount(20000);
		System.out.println("Account Holder name is: "+a.getName());
		System.out.println("Account Holder Email is: "+a.getEmail());
		System.out.println("Account Holder Account nuber is: "+a.getAccountno());
		System.out.println("Account Holder Amount is "+a.getAmount());
		
	}

}
