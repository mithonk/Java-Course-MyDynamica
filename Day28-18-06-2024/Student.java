class Student{
	int id;
	String name;
	
	void setStudent(){
		this.id = 1001;
		this.name = "Mithu";
	}
	
	void setStudent(int id){
		this.id = id;
		this.name = "Mithu";
	}
	
	void setStudent(String name){
		this.id = 1003;
		this.name = name;
	}
	
	void setStudent(String name, int id){
		this.id = id;
		this.name = name;
	}
	
	void setStudent(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display(){
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
	}
}