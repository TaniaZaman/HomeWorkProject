package hw5Q2Constructor;

public class StudentTest {

	public static void main(String[] args){
		/*Step 4: Create another class StudentTest. Create object as many as you want under the main
 method. Initialize constructors.

Step 5: My expectation is to see in the console as --> This is from the default Constructor 
of the Student class. in the next line, The second outcome -- > Student Name:<Your Name> , 
ID: <YourId>, Gender:<Your Gender> , Grade: <Any Grade> and Java Programmer? Ans: true.
 */
		
		Student tania = new Student(); 
		Student tania1 = new Student("Tania",25,'F',true,56f);

	}

}
