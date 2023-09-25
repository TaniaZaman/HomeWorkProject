package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe tania = new AboutMe();// Constructor initialized here
		tania.myName = "Tania"; // variables initialized
		tania.myAge = 35;
		tania.myGender = 'F';
		tania.myPhone = 1234567;
		tania.mySalary = 20976;
		tania.myBankBalance = 345787l;
		tania.myProperty = 255.5f;
		tania.myWorkingTime = 3.5;
		tania.fullTimeStudent = false;
		tania.aboutMe();// method implemented

		System.out.println("\n------------------------------------");
		AboutMe alex = new AboutMe();
		alex.myName = "Alex";
		alex.myAge = 35;
		alex.myGender = 'M';
		alex.myPhone = 45267890;
		alex.mySalary = 25267;
		alex.myBankBalance = 452678l;
		alex.myProperty = 45.55f;
		alex.myWorkingTime = 8.5;
		alex.fullTimeStudent = false;
		alex.aboutMe();

	}

}
