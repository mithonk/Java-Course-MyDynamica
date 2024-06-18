class MainStudent{
	public static void main(String args[]){
		
		Student obj1 = new Student();
		obj1.display();
		
		Student obj2 = new Student(1002);
		obj2.display();
		
		Student obj3 = new Student("Leo");
		obj3.display();
		
		Student obj4 = new Student("Das", 1004);
		obj4.display();
		
		Student obj5 = new Student(1005, "Theva");
		obj5.display();
	}
}