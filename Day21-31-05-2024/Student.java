class Student{
	int id;
	String name;
	
	/*
	void setStudent(int id, String name){
		this.id = id;
		this.name = name;
	}
	*/
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void getStudent(){
		System.out.println("Student ID : "+this.id);
		System.out.println("Student Name : "+this.name);
	}
}