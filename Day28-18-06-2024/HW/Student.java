class Student{
	int id;
	String name;
	
	Student(){
		this.id = 1001;
		this.name = "Mithu";
	}
	
	Student(int id){
		this.id = id;
		this.name = "Mithu";
	}
	
	Student(String name){
		this.id = 1003;
		this.name = name;
	}
	
	Student(String name, int id){
		this.id = id;
		this.name = name;
	}
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display(){
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
	}
}