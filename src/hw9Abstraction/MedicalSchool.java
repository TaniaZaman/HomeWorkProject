package hw9Abstraction;

public abstract class MedicalSchool {
	
	public MedicalSchool() {
		System.out.println("This Constructor is from MedicalSchool");
		
	}//Constructor declared
	

	
	public abstract void anatomyLab();//abstract method
	
	public void biochemistryLab() {
		System.out.println("something");// non abstract method
	}

}
