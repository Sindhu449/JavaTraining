package datatype;

import java.lang.reflect.Field;


public class Gettype {
	
	public static void main(String[] args) throws Exception  {
		
		Field nameField  = Student.class.getField("name");
		
		Class value = nameField.getType();
		
		System.out.println(" The type of the name field is " +value);
		    
         Field marksField = Student.class.getField("totalMarks");  

         value = marksField.getType();  

         System.out.println("The type of the totalMarks field is " + value);  

         Field feesField = Student.class.getField("totalFees");  

         value = feesField.getType();  

         System.out.println("The type of the totalFees field is " + value);  	
	}
	
	
	public class Student {
		public String name  = "Sindhu";
		public double totalMarks = 380;
		public float totalFees = 2433.99f;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getTotalMarks() {
			return totalMarks;
		}
		public void setTotalMarks(double totalMarks) {
			this.totalMarks = totalMarks;
		}
		public float getTotalFees() {
			return totalFees;
		}
		public void setTotalFees(float totalFees) {
			this.totalFees = totalFees;
		}
	}
	
}
	
