package hw12Abstraction;

public interface University extends Hospital,College {
	
	
	/*only extends keywords are used for the inheritance in Interface
	 *Interface inherit other Interfaces by extends keyword but can't inherit a regular class or abstract class
	 *Interface inherit more than one Interfaces by extends keyword.
	 * Above iNTERFACE University extends two interfaces College & Hospital seperated by comma.
	 */
	//public University() {
		
	//}
	// interface can not have Constructor.
	
	 public void classSize();
	 public void playGround();
	 public void teacher();
	 
	 //Default method
	 
	 public default void gymnasium() {
		 System.out.println("gymnasium default method is from University Interface");
		
	}
	 
	 //static method
	 public static void library() {
		 System.out.println("library static is method from University Interface"); 
		
	}

}
