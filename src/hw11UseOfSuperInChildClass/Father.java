package hw11UseOfSuperInChildClass;

public class Father {
	
	 public String name;
	 public  int age;
	 public  char sex;
	 public boolean citizen;
	 public String familyName;
	 
	 public Father() {
		 System.out.println("This is a default constructor from the Father Class.");
	 }
	 
	 public Father(String name,int age,char sex, boolean citizen) {
		 
		 this.name= name;
		 this.age= age;
		 this.sex= sex;
		 this.citizen= citizen;
		 System.out.println("My name is " + name +", Age " + age +", Sex" + sex + ", Am I Uscitize:"+ citizen);
		 
	 }
	 
	 public void father() {
		 
		 System.out.println("This is  a void typ method from Father class");
		
	}
	 
	 public void fatherInfo(String name,int age,char sex, boolean citizen){
		 System.out.println("My name is " + name +", Age " + age +", Sex" + sex + ", Am I Uscitize:"+ citizen);
		
	}
	 
	 

}
