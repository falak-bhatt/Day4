package exercise1_2;

public class student {
	int id;
	String name;
	
	student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void info() {
		System.out.println("Student ID = "+ id + " Name:"+ name);
	}

public static void main(String args[]) {
	student obj1 = new student(1,"Arnab");
	student obj2 = new student(2, "Rishi");
	obj1.info();
	obj2.info();
}
}