package hw4JavaVariables;

public class AboutMe {

	String myName; // variables declared;
	byte myAge;
	Short mySalary;
	int myPhone;
	long myBankBalance;
	float myProperty;
	double myWorkingTime;
	char myGender;
	boolean fullTimeStudent;

	AboutMe() {// THe Constructor is declared.
		System.out.println("This is all about us: ");
	}

	public void aboutMe() {// method is implemented here.
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Gender: " + myGender + "\nMy Phone: "
				+ myPhone + "\nMy Salary: " + mySalary + "\nMy Bank Balance Amount: " + myBankBalance
				+ "\nMy Property: " + myProperty + " Acore" + "\nMy Working Time: " + myWorkingTime
				+ "\nI Am A Fulltime Student: " + fullTimeStudent);
	}

}
