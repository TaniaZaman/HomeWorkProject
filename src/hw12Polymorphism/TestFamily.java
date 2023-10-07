package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("--------Sister Class --------");
		Sister sis = new Sister();
		sis.sister(23, 25, 56, 45, 21, "23");/// void type parameterized method is initialized
		sis.sister(18, 31, 33, "22", 45, 5);// void type parameterized method is initialized
		sis.sister("14", 19, 29, 17, 39, 28);// return type parameterized method is initialized
		sis.sister(45, 67, 34, 23, "41", 17);// return type parameterized method is initialized
		sis.sister(7, "30", 25, 43, 15, 12);// return type parameterized final method initialized
		Sister.sister(4,12, "15", 48, 40, 71);// return type parameterized static method initialized
		sis.sister();// void type method initialized
		
		
		System.out.println("--------Niece Class --------");
		Niece niece = new Niece();

		niece.sister(23, 25, 56, 45, 21, "23");/// void type parameterized method is initialized
		niece.sister(18, 31, 33, "22", 45, 5);// void type parameterized method is initialized
		niece.sister("14", 19, 29, 17, 39, 28);// return type parameterized method is initialized
		niece.sister(45, 67, 34, 23, "41", 17);// return type parameterized method is initialized
		//niece.sister(7, "30", 25, 43, 15, 12);// return type parameterized final method initialized
		//niece.sister(4,12, "15", 48, 40, 71);// return type parameterized static method initialized
		niece.sister();// void type method initialized

	}

}
