package hw8Inheritance;

public class AnimalTest {

	

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();  
		mammal.animalInfo();  //Single Inheritance
		
		// Here mammal class extends Animal class and inherits properties of only Animal class along with own class properties.
		// Here Mammal is the child or subclass and Animal is the Parent class
		// This is an example of Single Inheritance
		
		System.out.println("\n----------------------------------------------------\n");
		
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo(); //Multilevel Inheritance
		bullDog.mammalInfo(); //Multilevel Inheritance
		bullDog.animalInfo();  //Multilevel Inheritance
		
		// Here, Bulldog class inherits properties of Dog, Mammal, and Animal class along with its own class properties.
		// Here Dog is the parent class of subclass Bulldog.
		// Here, Bulldog extends Dog, Dog extends Mammal and Mammal extends Animal class.
		// This is example of Multilevel Inheritance.
		
		System.out.println("\n----------------------------------------------------\n");
		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		
		// Here, three sub classes (Mammal, Birds and reptile) have been derived from one parent class (Animal).
		// All these three subclass will inherit properties of parent Animal class.
		// This is an example of Hierarchical Inheritance.
		
		System.out.println("\n----------------------------------------------------\n");
		
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		
		//

	}

}
