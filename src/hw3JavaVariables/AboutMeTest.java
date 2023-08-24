package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMeTest = new AboutMe();

		System.out.println(" My Name: " + aboutMeTest.myName + "\n My Age: " + aboutMeTest.myAge + "\n My BankBalance: "
				+ aboutMeTest.bankBalance + "\n My Phone Number: " + aboutMeTest.phone + "\n My Salary: "
				+ aboutMeTest.mySalary + "\n My Property: " + aboutMeTest.myProperty +" Acore" + "\n My Working Hour: "
				+ aboutMeTest.myWorkingTime + "\n My Gender: " + aboutMeTest.myGender + "\n I am FullTime Student: "
				+ aboutMeTest.fullTimeStudent);

		aboutMeTest.aboutMe(); // Method declared and implemented;

	}

}
