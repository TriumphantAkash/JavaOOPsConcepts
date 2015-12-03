
//INHERITANCE in java is a mechanism in which one object acquires all 
//the properties of the parent object
//FUNCTION OVERRIDING is RUNTIME POLYMORPHISM

//MULTIPLE INHERITANCE is supported only through INTERFACES in java
//MULTILEVEL, HIERARCHICAL INHERITANCE is supported through CLASS in java

class Employee {
	float salary=40000;
}

class Programmer extends Employee{
	int bonus = 10000;
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programmer programmer = new Programmer();
		System.out.println(programmer.bonus);
		System.out.println(programmer.salary);

	}

}
