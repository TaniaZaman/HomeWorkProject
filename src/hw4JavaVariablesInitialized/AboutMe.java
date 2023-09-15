package hw4JavaVariablesInitialized;

/*Step 1: Copy the package "hw3JavaVariables" and paste it inside the src file of the Home Work project. Rename it to "hw4JavaVariablesInitialized".

Step 2: Direct to the Class "AboutMe" in the above package.

Step 3: Inside the void type method "aboutMe" body, call all the variables inside syso. (you can use String concatenation to make it a more meaningful outcome).

Step 4: Inside "AboutMeTest" Class, remove the variables called by the object. object will only call the aboutMe method.

Step 5: Follow indentation by Organizing the code. push to GitHub and paste the link of GitHub below.*/



public class AboutMe {

	String name;//variable declared;
	String myName = "Tania"; // variable declared and initialized;
	byte myAge = 36;
	Short mySalary = 23435;
	int myPhone = 3435235;
	long myBankBalance = 24353545l;
	float myProperty = 255.5f;
	double myWorkingTime = 3.5;
	char myGender = 'F';
	boolean fullTimeStudent = false;

	AboutMe() { // Constructor declared and initialized;
		System.out.println(":------------ This is all about Myself ------------:");

	}

	public void aboutMe() {

		System.out.println("My Name: "+ myName +"\nMy Age: "+ myAge+ 
				"\nMy Gender: "+myGender +"\nMy Phone: "+ myPhone+
				"\nMy Salary: "+ mySalary+ "\nMy Bank Balance Amount: "+ myBankBalance+
				"\nMy Property: "+myProperty+ " Acore"+ "\nMy Working Time: "+myWorkingTime +
				"\nI Am A Fulltime Student: "+fullTimeStudent);

	}

}
