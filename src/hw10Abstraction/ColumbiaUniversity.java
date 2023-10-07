package hw10Abstraction;




public class ColumbiaUniversity extends MedicalSchool {
	/* extends and implements keywords are used for the inheritance in Java for a regular Class.
	 * an regular Class inherit another Abstract Class or a regular class by extends keyword
	 * an regular Class inherit only one Abstract Class or a regular class
	   but more than one interfaces separated by comma.
	 * Above a regular Class ColumbiaUniversity extends an Abstract Class MedicalSchool.
	 * since regular class can't declared a method once abstract class extends by regular class
	   abstract method will be implemented using @override annotation in regular class.
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

}
