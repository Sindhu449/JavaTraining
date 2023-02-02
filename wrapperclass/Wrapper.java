package wrapperclass;
//wrapper objects and vice-versa  
public class Wrapper {
	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean bl=true;
		//Autoboxing: Comverting Primitives to obj
		Byte bobj=b;
		Short  sobj=s;
		Integer iobj=i;
		Long lobj=l;
		Float fobj=f;
		Double dobj=d;
		Character cobj=c;
		Boolean blobj=bl;
		
		
		//print obj
		
		System.out.println("-------- Printing object values----------");
		System.out.println(" Byte object is : " +bobj);
		System.out.println(" Short object is : " +sobj);
		System.out.println(" Long object is : " +lobj);
		System.out.println(" Integer object is : " +iobj);
		System.out.println(" Float object is : " +fobj);
		System.out.println(" Double object is : " +dobj);
		System.out.println(" Character object is : " +cobj);
		System.out.println(" Boolean object is : " +blobj);
		
		//unboxing: obj to primitive
		
		byte bvalue = bobj;
		short svalue = sobj;
		long lvalue = lobj;
		int ivalue = iobj;
		float fvalue = fobj;
		double dvalue = dobj;
		char cvalue = cobj;
		boolean blvalue = blobj;
		
		// Printing primitives
		
		System.out.println("------- Printing Priitives-------------");
		System.out.println("byte value: "+bvalue);
		System.out.println("short value: "+svalue);
		System.out.println("Int value: "+ivalue);
		System.out.println("long value: "+lvalue);
		System.out.println("float value: "+fvalue);
		System.out.println("double value: "+dvalue);
		System.out.println("char value: "+cvalue);
		System.out.println("booelan value: "+blvalue);
		
				

		
	}

}
