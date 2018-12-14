//a derived class has its own constructors. it doesn't inherit any constructors from the base class
//in the definition of a constructor for the derived class, the typical first action is to call a constructor of the base class
//this chain works for all classes
//when you omit a call to the base-class constructor in any derived-class constructor, the default constructor of the base class
	//is called as the first action in the new constructor

public class Inheritance4{
	
	public static void main(String[] args) {
		//A objA = new A();
		B objB = new B(1,100);
		//C objC = new C();
	}
	
	
}

class A{
	
	int intA = 10;
	public A() {
		System.out.println("inside A");
		}
	public A(int noA) {
		intA = 2*noA;
		System.out.println("intA " + intA);
	}
}

class B extends A{
	
	int intB = 20;

	public B() {
		super(0);
		System.out.println("inside B");
		}
	public B(int no1, int no2) {
		super(no1);
		intB = no2;
		System.out.println("integer A " + intA);
		System.out.println("integer B " + intB);
	}
}
/*
class C extends B{
	public C() {
		System.out.println("inside C");
	}
	
}
*/