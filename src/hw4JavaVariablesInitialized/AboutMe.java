package hw4JavaVariablesInitialized;

public class AboutMe {

	String name;// variable declared;
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

		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Gender: " + myGender + "\nMy Phone: "
				+ myPhone + "\nMy Salary: " + mySalary + "\nMy Bank Balance Amount: " + myBankBalance
				+ "\nMy Property: " + myProperty + " Acore" + "\nMy Working Time: " + myWorkingTime
				+ "\nI Am A Fulltime Student: " + fullTimeStudent);

	}

}
