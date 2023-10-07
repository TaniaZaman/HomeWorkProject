package hw10Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Tania");
		employee.setAge(48);
		employee.setSex('F');
		employee.setCitizen(true);
		
		System.out.println("The Employee Name is: " + employee.getName() + "\nEmployee Age: " + employee.getAge() + "\nEmployee Sex: " + employee.getSex() + "\nand Is US Citizen? Ans: " + employee.isCitizen());
		
		
			}

}
