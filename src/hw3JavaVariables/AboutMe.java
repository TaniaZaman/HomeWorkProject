package hw3JavaVariables;

/*HW3: Step 1: Create a package name --> "hw3JavaVariables" inside the src file of the Home Work project. 
Step 2: Create a Class "AboutMe" in the above package. Step 3: Declare one variable type with a variable 
name as your wish (only one, so you know what is variable declared). 
Step 4: Now initialize String, byte, short, int, long, float, double, char, 
and boolean type variables to define yourself. For example myName, myAge, myGender, fullTimeStudent, etc. 
You can also use on your own and at least 1 each type of variable. 
Step 5: Declare a Constructor inside the class. We expect an outcome from the Constructor Body as
":------------ This is all about Myself ------------:" Step 6: Implement a void type method name 
"aboutMe" inside the class. We expect an outcome from the method, "I am aboutMe method" 
Step 7: Create another class "AboutMeTest" inside the package. Instantiate AboutMe class inside the main method
body and call all the variables by the object inside one syso (you can use String concatenation to make it a 
		more meaningful outcome). Also initialized method. Step 8: Give a single-line comment where a variable is
declared and where is initialized (Example: // Variable declared), Constructor declared and initialized,
	method implemented and initialized. 
	Step 9: Follow indentation by Organizing the code. Now Copy the code and paste it below as the Answer.*/


public class AboutMe {

	String name;//variable declared;
	String myName = "Tania"; // variable declared and initialized;
	byte myAge = 36;
	Short mySalary = 23435;
	int phone = 3435235;
	long bankBalance = 24353545l;
	float myProperty = 255.5f;
	double myWorkingTime = 3.5;
	char myGender = 'F';
	boolean fullTimeStudent = false;

	AboutMe() { // Constructor declared and initialized;
		System.out.println(":------------ This is all about Myself ------------:");

	}

	public void aboutMe() {

		System.out.println(" I am aboutMe method");

	}

}
