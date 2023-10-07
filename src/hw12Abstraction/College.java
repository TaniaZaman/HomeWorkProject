package hw12Abstraction;

public interface College {
	
	

	 public void commonRoom();
	 public void laboratory();
	 public void languageClub();
	 
	 //Default method
	 
	 public default void dorm() {
		 System.out.println("dorm default method from college Interface");
		
	}
	 
	 //static method
	 public static void studyRoom() {
		 System.out.println("studyroom static method from college Interface");
		
	}

}
