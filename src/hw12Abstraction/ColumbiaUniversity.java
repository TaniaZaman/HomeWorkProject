package hw12Abstraction;




public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	/* extends and implements keywords are used for the inheritance in Java for a regular Class.
	 * an regular Class inherit another Abstract Class or a regular class by extends keyword
	   but inherit interfaces by implements keyword.
	 * an regular Class inherit only one Abstract Class or a regular class
	   but more than one interfaces separated by comma.
	 * Above a regular Class ColumbiaUniversity extends an Abstract Class MedicalSchool and implements two Interfaces University, VocationalSchool.
	 * since regular class can't declared a method once abstract class extends by regular class and two Interfaces implemented by regular class
	   so inherited abstract method from them will be implemented using @override annotation in regular class.
	 */
	
	
	
	//public abstract void chemistry();
	//abstract Method can't be declared in regular class.
	
	public ColumbiaUniversity(){
		System.out.println("This Constructor is from ColumbiaUniversity");
		
	}
	
	
	public void biology() {
		System.out.println("biology method is from ColumbiaUniversity");
		
		
	}

	@Override
	public void anatomyLab() {
		System.out.println("anatomyLab abstract method is from MedicalSchool abstract class");
		
	}


	@Override
	public void nursing() {
		System.out.println("nursing abstract method is from NursingSchool abstract class");
		
	}


	@Override
	public void emergencyRoom() {
		System.out.println("emergencyRoom abstract method is from Hospital Interface");
		
	}


	@Override
	public void surgeryRoom() {
		System.out.println("surgeryRoom abstract method is from Hospital Interface ");
		
	}


	@Override
	public void cafeteria() {
		System.out.println("cafeteria abstract method is from Hospital Interface");
		
		
	}


	@Override
	public void commonRoom() {
		System.out.println("commonRoom abstract method is from College Interface");
		
	}


	@Override
	public void laboratory() {
		System.out.println("commonRoom abstract method is from College Interface");
		
	}


	@Override
	public void languageClub() {
		System.out.println("commonRoom abstract method is from College Interface");
		
	}


	@Override
	public void lawInfo() {
		System.out.println("lawInfo abstract method is from LawSchool Interface");
		
	}


	@Override
	public void vocationalInfo() {
		System.out.println("lawInfo abstract method is from LawSchool Interface");
		
	}


	@Override
	public void classSize() {
		System.out.println("classSize abstract method is from University Interface");
		
	}


	@Override
	public void playGround() {
		System.out.println("playGround abstract method is from University Interface");
		
	}


	@Override
	public void teacher() {
		System.out.println("teacher abstract method is from University Interface");
		
	}

}