
public class Interitance5 {

	public static void main(String[] args) {
		Person1 p1 = new Person1();
		Person1 p2 = new Person1();
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Person p3 = new Student();
		// Student s = new Person(); would be ILLEGAL

	}
}

class Person1{
	
	String name;
	int age;
	String address;
	
}

class Student1 extends Person {
	
	int marks;
	int rollNumber;
}