package hw12Polymorphism;

/*When different methods exist with the same method name but with different parameters or signature, 
  it is called method overloading. Method Overloading occurs during compile time.
  
 */

public class Sister {
	// void type parameterized method (1) is implemented
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total = (age1+age2+age3+Integer.parseInt(age4)+age5+age6);
		System.out.println("Total age of void type sister is :"+ total);
		
	}
	// void type parameterized method (2) is implemented
	public void sister(int age1, int age2, int age3, int age5, int age6,String age4) {
		int total1 = (age1+age2+age3+age5+age6+Integer.parseInt(age4));
		System.out.println("Total age of void type sister is :"+ total1);
		
	}
	// return type parameterized method (3) is implemented
	public int sister(String age4, int age1, int age2, int age3, int age5, int age6) {
		int total2 = (Integer.parseInt(age4)+age1+age2+age3+age5+age6);
		System.out.println("Total age of return type sister is :"+ total2);
		return total2;
	
}
	// return type parameterized method (4) is implemented
	public int sister( int age1, int age2, int age3, int age5,String age4, int age6) {
		int total3 = (Integer.parseInt(age4)+age1+age2+age3+age5+age6);
		System.out.println("Total age of returb type sister is :"+ total3);
		return total3;
		
	}
	// return type final parameterized method (5) is implemented
	public final int sister(int age1,String age4, int age2, int age3, int age5, int age6) {
		int total4 = (age1+Integer.parseInt(age4)+age2+age3+age5+age6);
		System.out.println("Total age of final type sister is :"+ total4);
		return total4;
	}
	// return type static parameterized method (6) is implemented
	public static int sister(int age1, int age2, String age4,int age3, int age5, int age6) {
		int total5 = (age1+Integer.parseInt(age4)+age2+age3+age5+age6);
		System.out.println("Total age of static type sister is :"+ total5);
		return total5;
	}
	// void type method
	public void sister() {
		System.out.println("This is from void type method");
		
	}
		

}
