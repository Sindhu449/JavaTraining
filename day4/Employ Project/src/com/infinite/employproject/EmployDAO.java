package com.infinite.employproject;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	
	static List<Employ> employList;
	static {
		employList = new ArrayList<Employ>();
	}
	public String updateEmployDao(Employ employnew){
		Employ employFound = searchEmployDao(employnew.getEmpno());
		if(employFound!=null){
			for (Employ employ : employList) {
                 if(employ.getEmpno()== employnew.getEmpno()){
                	 employ.setName(employnew.getName());
                	 employ.setDept(employnew.getDept());
                	 employ.setGender(employnew.getGender());
                	 employ.setDesig(employnew.getDesig());
                	 employ.setBasic(employnew.getBasic());
                 }
			}
			return "Employ Record Updated..";
		}
		return "Employ record not found";
	}
	public String deleteEmployDao(int empno){
		Employ employFound = searchEmployDao(empno);
		if(employFound==null){
			employList.remove(employFound);
			return "EMploy Record Deleted";
		}
		return "Employ Record not found";
	}
	//create this for search employ
	public Employ searchEmployDao(int empno){
		Employ employFound = null;
		for (Employ employ : employList) {
			if(employ.getEmpno()==empno){
				employFound = employ;
			}
		}
		return employFound;
	}
	//create this for show employ
	public List<Employ> showEmploydao(){
		return employList;
	}
	//create this for add employ

	public String addEmployDao(Employ employ){
		employList.add(employ);
		return "Employ Record Inserted...";
	}
}
