package hw11UseOfSuperInChildClass;



public class Daughter extends Father{
	
	public String birthMonth;
	public int age;
	
	public Daughter() {
		super("Tiana", 54, 'F', false);
		super.father();
		super.fatherInfo("Akkas", 25, 'M', true);
		super.familyName= "Aphrodity";
		System.out.println("My Daughter's family name is "+ familyName);
		System.out.println("This is a default constructor from the Daughter Class.");
	}
	
	public Daughter(String birthMonth,int age) {
		super("Mofij", 42, 'M', false);
		super.father();
		super.fatherInfo("Shamsu",21, 'M', true);
		super.familyName="jorina";
		System.out.println("My Daughter's family name is "+ familyName);
		this.birthMonth=birthMonth;
		this.age=age;
		System.out.println("My Birth Month is " + birthMonth + ", Age" + age);
		
	}
	
	public void daughter() {
		super.father();
		super.fatherInfo("Modon",34, 'M', false);
		super.familyName="sakhina";
		System.out.println("My Daughter's family name is "+ familyName);
		System.out.println("This is  a void typ method from Daughter class");
	}
	
	public void daughterInfo() {
		super.father();
		super.fatherInfo("Rahima",34, 'F', false);
		super.familyName="Hasina";
		System.out.println("My Daughter's family name is "+ familyName);
		System.out.println("My Birth Month is " + birthMonth + ", Age" + age); 
		
	}

}
