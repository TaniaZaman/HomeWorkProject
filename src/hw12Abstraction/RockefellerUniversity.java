package hw12Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	public void maths() {
		System.out.println("maths method is from RockefellerUniversity");

		
		
	}

	@Override
	public void aeronauticalInfo() {
		 System.out.println("aeronauticalInfo method is from AeronauticalSchool Interface");		
	}

	@Override
	public void mechanicalLab() {
		System.out.println("mechanicalLab method is from EngineeringSchool abstract class");		
		
		
	}

}
