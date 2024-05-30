class Student{
	int id;
	String name;
	
	void setStudent(int ids, String names){
		id = ids;
		name = names;
	}
	
	void getStudent(){
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
	}
}