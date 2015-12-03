class Vehicle {
	int speed = 100;
}

class Bike extends Vehicle {
	
	Bike(){
		super();//calling Parent class constructor from child class constructor
	}
	
	int speed = 40;
	void display() {
		System.out.println(super.speed);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.display();
	}

}
