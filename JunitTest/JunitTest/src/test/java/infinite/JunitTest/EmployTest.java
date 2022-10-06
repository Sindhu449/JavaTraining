package infinite.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public String testtoString(){
		return  "Employ [empno=1" + ", name=Sindhu" + ", gender=FEMALE" + ", dept=java" + ", desig=programming"
				+ ", basic=78545 "+ "]";
	
		
	}
	@Test
	public void testGettersAndSetters(){
		Employ employ1 = new Employ();
		employ1.setEmpno(1);
		employ1.setName("Sindhu");
		employ1.setGender(Gender.FEMALE);
		employ1.setDept("java");
		employ1.setDesig("Programmaer");
		employ1.setBasic(84834);
	}
	@Test
	public void testConstructor() {
		Employ employ1 = new Employ();
		assertNotNull(employ1);
		Employ employ2=new Employ(1,"javed khan",Gender.MALE,"Java","Programmer",88424);
		assertEquals(1, employ2.getEmpno());
		assertEquals("javed khan", employ2.getName());
		assertEquals(Gender.MALE,employ2.getGender());
		assertEquals("Java",employ2.getDept());
		assertEquals("Programmer",employ2.getDesig());
		assertEquals(88424,employ2.getBasic(),0);
	}
}
