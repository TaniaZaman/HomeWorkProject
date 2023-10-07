package hw11UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("---------- default constructor initialized from The Class Father -----------");
		Father f = new Father();
		System.out.println("---------- parameterized constructor initialized from The Class Father -----------");
		Father f1 = new Father("tania",48,'F',true);
		
		
		f1.father();
		f1.fatherInfo("Tina", 39, 'F', true);
		
		
		
		

	}

}
