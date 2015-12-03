//multiple inheritance

interface Printable{  
	void print();  
}  
interface Showable{  
	void print();  
} 

public class TestInterface implements Printable, Showable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface obj = new TestInterface();  
		obj.print(); 
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
}