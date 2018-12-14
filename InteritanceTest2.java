public class InteritanceTest2{
	
	public static void main(String[] args) {
		Cycle cycle = new Cycle();
		Bicycle bicycle = new Bicycle();
		cycle.printInfo();
		bicycle.printInfo();
	}
	
}

class Cycle{
	int weight = 10;
	public void printInfo() {
		System.out.println("superclass"+weight);
	}
}

class Bicycle extends Cycle{
	String brand = "hero";
	public void printInfo() {
		System.out.println("subclass"+brand);
	}
//by naming a method in the subclass the same as a method in the superclass, we're 'METHOD OVERRIDING'
	//when we 'method override', Java executes the method in the subclass if we're calling a subclass object

}