package hw11Abstraction;

public interface Hospital {
	

	 public void emergencyRoom();
	 public void surgeryRoom();
	 public void cafeteria();
	 
	 //Default method
	 
	 public default void morgue() {
		 System.out.println("morgue default method is from Hospital Interface");
		
	}
	 
	 //static method
	 public static void pharmacy() {
		 System.out.println("pharmacy static is method from Hospital Interface");
		
	}


}
