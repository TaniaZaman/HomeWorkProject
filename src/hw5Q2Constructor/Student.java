package hw5Q2Constructor;
/*Step 2: Create a class "Student". Declare some variable -- stName, stID, sex, 
 * isProgrammer(as boolean), grade (as float).

Step3: Declare the default constructor and only one parameterized constructor by using 
(hints: source -- generate constructor using fields-). Use only one System.out.println() 
in the parameterized constructor to declare the above variables.

Step 4: Create another class StudentTest. Create object as many as you want under the main
 method. Initialize constructors.

Step 5: My expectation is to see in the console as --> This is from the default Constructor 
of the Student class. in the next line, The second outcome -- > Student Name:<Your Name> , 
ID: <YourId>, Gender:<Your Gender> , Grade: <Any Grade> and Java Programmer? Ans: true.
 */

public class Student {

	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from default Constructor.");

	};

	public Student(String stName, int stID, char sex, boolean isProgramming, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgramming;
		this.grade = grade;

		System.out.println("Student name is: " + stName + ", ID is: " + stID + ", Gender: " + sex + ", Grade: " + grade
				+ ", java programmer: " + isProgramming);

	}

}
