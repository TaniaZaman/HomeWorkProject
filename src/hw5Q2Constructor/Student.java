package hw5Q2Constructor;

public class Student {

	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from default Constructor.");

	};

	public Student(String stName, int stID, char sex, boolean isProgramming, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgramming;
		this.grade = grade;

		System.out.println("Student name is: " + stName + ", ID is: " + stID + ", Gender: " + sex + ", Grade: " + grade
				+ ", java programmer: " + isProgramming);

	}

}
