//Method OVERRIDING is RUNTIME polymorphism
//Note: we can not override static method

class Bank {
	int getRateOfInterest(){
		return 0;
	}
}

class ICICIBank extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 5;
	}
}

class IOB extends Bank{
	int getRateOfInterest() {
		return 6;
	}
}

public class OverridingExample {

	public static void main(String[] args) {
		IOB iob = new IOB();
		ICICIBank icici = new ICICIBank();
		SBI sbi = new SBI();
		
		System.out.println("IOB rate of Interest is: "+iob.getRateOfInterest());
		System.out.println("SBI rate of Interest is: "+sbi.getRateOfInterest());
		System.out.println("ICICI rate of Interest is: "+icici.getRateOfInterest());
	}

}
