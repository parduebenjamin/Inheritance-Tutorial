
public class InheritanceTest{
	
	public static void main(String[] args) {
		/*ClassB obj = new ClassB();
		obj.displayB();
		ClassB obj1 = new ClassB();
		obj1.displayA();
		*/
		ClassC objC = new ClassC();
		objC.displayA();
		objC.displayB();
		objC.displayC();
		
	}
}

class ClassA {
	
	int a = 5;
	public void displayA() {
		System.out.println(a);
	}
}

class ClassB extends ClassA{
	
	int b=10;
	public void displayB() {
		System.out.println(b);
		
	}
}

class ClassC extends ClassB{
	int c = 20;
	public void displayC() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
}