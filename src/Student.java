
public class Student {
	
	//instance variables 
	String name;
	int age;
	int year;
	String course;
	
	//constructor
	//Student()
	public Student(){
		name = "John";
		age = 25;
		year = 3;
		course = "Bsc";
	}
	
	//Student("James",23,2,"Msc")
	public Student(String name,int age, int year, String course) {
		this.name = name;
		this.age = age;
		this.year = year;
		this.course = course;
	}
	
	public Student(String name, String course) {
		this.name = name;
		this.course = course;
	}
	
	//methods
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.name);
		
		Student s2 = new Student("James",23,2,"Msc");
		System.out.println(s2.name);
		

	}

}
