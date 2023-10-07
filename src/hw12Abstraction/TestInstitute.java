package hw12Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class ColumbiaUniversity ------------------------\n");
		ColumbiaUniversity cUniversity=new ColumbiaUniversity();// here Constructor is Initialized
		// Below methods are initialized by cUniversity object
		cUniversity.biology();
		cUniversity.anatomyLab();
		cUniversity.biochemistryLab();
		cUniversity.emergencyRoom();
		cUniversity.surgeryRoom();
		cUniversity.cafeteria();
		cUniversity.morgue();
		cUniversity.commonRoom();
		cUniversity.laboratory();
		cUniversity.languageClub();
		cUniversity.dorm();
		cUniversity.classSize();
		cUniversity.playGround();
		cUniversity.teacher();
		cUniversity.gymnasium();
		cUniversity.anthropology();
		cUniversity.maths();
		cUniversity.computerLab();
		cUniversity.mechanicalLab();
		cUniversity.caring();
		cUniversity.nursing();
		cUniversity.lawInfo();
		cUniversity.aeronauticalInfo();
		cUniversity.vocationalInfo();
		// if a method is static, no help needed from object, the class or Interface can directly call it.
		Hospital.pharmacy();
		University.library();
		College.studyRoom();
		
		System.out.println("\n--------------------- Abstract class MedicalSchool ------------------------\n");
		// an Abstract Class can't be instantiated, it needs the help of a concrete class like ColumbiaUniversity
		MedicalSchool mSchool=new  ColumbiaUniversity();
		
		mSchool.anatomyLab();
		mSchool.biochemistryLab();
		mSchool.anthropology();
		mSchool.maths();
		mSchool.caring();
		mSchool.computerLab();
		mSchool.mechanicalLab();
		mSchool.nursing();
		mSchool.lawInfo();
		mSchool.aeronauticalInfo();
		
		System.out.println("\n--------------------- Interface University ------------------------\n");
		 //an Interface can't be instantiated, it needs the help of a concrete class like ColumbiaUniversity
		University university = new ColumbiaUniversity();
		
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		// if a method is static, no help needed from object, the class or Interface can directly call it.
		University.library();
		
		
		
		
		
		
		
		
		//University university = new University();
		//MedicalSchool mSchool = new MedicalSchool();

	}

}
