package Encapsulation;

class Student{
	private String name;
	private int rno;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Encapsulation {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Sindu");
		s.setAge(23);
		s.setRno(101);
		
		System.out.println("Student name is: " +s.getName());
		System.out.println("Student Roll No. is: " +s.getRno());
		System.out.println("Student age is: " +s.getAge());
	}

}
