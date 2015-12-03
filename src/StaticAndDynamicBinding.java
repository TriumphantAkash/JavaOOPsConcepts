//Method overloading is static binding example, method overriding is Dynamic binding example
//This is Dynamic / late Binding example

class A {
	void method() {
		System.out.println("From class A");
	}
}

class B extends A {
	void method(){
		System.out.println("From class B");
	}
}


public class StaticAndDynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.method();
		
		A a2 = new B();
		a2.method();
	}

}
