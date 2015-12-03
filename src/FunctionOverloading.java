//function overloading example
//COMPILE TIME POLYMORPHISM
public class FunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading cal  = new FunctionOverloading();
		cal.sum(1, 2);
		cal.sum(1, 2, 3);
		
	}
		void sum(int a, int b){
			System.out.println(a+b);
		}
		
		void sum(int a, int b, int c){
			System.out.println(a+b+c);
		}
/*
 * This will end in compile time error (duplicate function)
		int sum(int a, int b){
			System.out.println(a+b);
		}

*/
		//WE CAN OVERLOAD MAIN METHOD
		public static void main(int i) {
			// TODO Auto-generated method stub
			//FunctionOverloading cal  = new FunctionOverloading();
			System.out.println("The 2nd main method is called");
			
		}
}