
class Student {
	int rollno;
	String name;
	static String college;
}
public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		student1.college = "MeethiBai College";
		student1.name = "Manoj";
		student1.rollno=420;
		

		Student student2 = new Student();
		student2.college="Farji college";
		student2.name="Akash";
		student2.rollno=421;
		
		
		System.out.println("Student 1 details:");
		System.out.println(student1.name);
		System.out.println(student1.college);
		

		System.out.println("Student 2 details:");
		System.out.println(student2.name);
		System.out.println(student2.college);
		
		System.out.println("Student 1 details:");
		System.out.println(student1.name);
		System.out.println(student1.college);
		
		//OBSERVATION: it prints "Farji college" in all the print statements"
	}

}
