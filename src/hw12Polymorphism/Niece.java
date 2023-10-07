package hw12Polymorphism;

public class Niece extends Sister {
	/*When different methods exist with the same method name with same parameters or signature but 
	 * with different syntax or logic, it is called method overriding. Method Overriding occurs during run time.
	 * 
	 */

	// void type parameterized method (1) is implemented
	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total = (age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6) / 2;
		System.out.println("Total age of void type sister is :" + total);

	}

	// void type parameterized method (2) is implemented
	@Override
	public void sister(int age1, int age2, int age3, int age5, int age6, String age4) {
		int total1 = (age1 + age2 + age3 + age5 + age6 + Integer.parseInt(age4)) * 4;
		System.out.println("Total age of void type sister is :"+ total1);

	}

	// void type parameterized method (3) is implemented
	@Override
	public int sister(String age4, int age1, int age2, int age3, int age5, int age6) {
		int total2 = (Integer.parseInt(age4) + age1 + age2 * 2 + age3 + age5 + age6);
		System.out.println("Total age of return type sister is :"+ total2);
		return total2;

	}

	// return type parameterized method (4) is implemented
	@Override
	public int sister(int age1, int age2, int age3, int age5, String age4, int age6) {
		int total3 = (Integer.parseInt(age4) + age1 / 4 + age2 + age3 + age5 + age6);
		System.out.println("Total age of return type sister is :"+ total3);
		return total3;

	}
	// Return type parameterized method which is final and implemented
	// Final type method cannot be Overriden -- important interview question
	// Cannot override the final method from Sister
	// return type final parameterized method (5) is implemented
	/*
	 * @Override 
	 * public final int sister(int age1,String age4, int age2, int age3,
	 * int age5, int age6) { 
	 * int total4 =
	 * (age1+Integer.parseInt(age4)+age2+age3+age5+age6);
	 * System.out.println("Total age of final type sister is :"+ total4);
	 *  return total4; }
	 */
	// return type static parameterized method (6) is implemented
	// static parameterized method can't override or implemented
	// because static is a local member method of a class
	// So, static method can't be override, if we remove @override it will work as
	// static method of this niece class

	/*
	 * @Override public static int sister(int age1, int age2, String age4,int age3,
	 * int age5, int age6) { int total5 =
	 * (age1+Integer.parseInt(age4)+age2+age3+age5+age6); 
	 * System.out.println("Total age of static type sister is :"+ total5);
	 * return total5; }
	 */

}
