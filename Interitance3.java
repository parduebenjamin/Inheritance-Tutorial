public class Interitance3{
	
	public static void main(String[] args) {
	
	Person p = new Person();
	Student s = new Student();
	GraduateStudent g = new GraduateStudent();
	
	Person p2 = new Student();
	Student s2 = (Student)p2;
	System.out.println(s2);
	
	//Person p2 = new Student(); everything that Person needs Student has, therefore this is okay
	//Student s2 = new Person(); Person doesn't have everything a Student needs, therefore this is ILLEGAL
	/*GraduateStudent g2 = new Person(); see above
	GraduateStudent g3 = new Student();*/
	Person p3 = new GraduateStudent();
	Student s3 = new GraduateStudent();
	/*
	g.setMarks(100);;
	g.printInfo();
	g.getMarks();
	g.isHonors();
	*/
	}
	
}

class Person{
	String name = "Ben";
	int age = 26;
	String address = "123 Fakestreet";
		
	public void printInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age "+age);
		System.out.println("Address "+address);
	}
	
}

class Student extends Person{
	int marks = 0;
	int rollNumber = 29;
	
	public void setMarks(int mark) {
		marks = mark;
	}
	public void getMarks() {
		System.out.println("Grade is "+marks);
		
		//super.print();
	}
	
}

class GraduateStudent extends Student{
	String graduationDate = "31MAY2021";
	public void isHonors() {
		if( marks > 90) {
			System.out.println("Honor Student");
			} else {
				System.out.println("Not an Honor Student");
			}
	}
	
}