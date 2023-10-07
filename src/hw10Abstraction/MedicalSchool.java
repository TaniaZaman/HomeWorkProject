package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool{
	
	/* extends and implements keywords are used for the inheritance in Java for Abstract Class
	 * yes, an Abstract Class inherit only one Abstract Class or a regular class by extends keyword
	 
	 *  an Abstract Class inherit only one Abstract Class or a regular class but more than one interfaces separated by comma.
	 *  Above Abstract Class MedicalSchool extends Abstract Class NursingSchool.
	 */
	
	public MedicalSchool() {
		System.out.println("This Constructor is from MedicalSchool");
		
	}//Constructor declared
	

	
	public abstract void anatomyLab();//abstract method
	
	public void biochemistryLab() {
		System.out.println("biochemistryLab method is from MedicalSchool");// non abstract method
	}

}
