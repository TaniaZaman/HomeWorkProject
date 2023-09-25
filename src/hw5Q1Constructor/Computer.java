package hw5Q1Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingsystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	Computer() {// Default Constructor
		System.out.println("This is from the default Constructor of Computer class.");
	}

	Computer(String brand, String model) {// parameterized Constructor 02
		this.brand = brand;
		this.model = model;
		System.out.println("My Brand: " + brand + ", Model: " + model);

	}

	Computer(String brand, char grade, boolean madeInUSA) {// parameterized Constructor 03
		this.brand = brand;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("My Brand: " + brand + ", Grade: " + grade + ", Made in the USA: " + madeInUSA);

	}

	Computer(String brand, String model, String operatingsystem, int price) {// parameterized Constructor 04
		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;

		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingsystem
				+ ", Price: " + price);
	}

	Computer(String brand, String model, String operatingsystem, int price, char grade) {// parameterized Constructor 05
		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.grade = grade;

		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingsystem
				+ ", Price: " + price + ", Grade: " + grade);
	}

	Computer(String brand, String model, String operatingsystem, int price, char grade, boolean madeInUSA) {// parameterized
																											// Constructor
																											// 06
		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingsystem
				+ ", Price: " + price + ", Grade: " + grade + ", Made in the USA: " + madeInUSA);

	}
}
