class MainStudent{
	public static void main(String args[]){
		
		Student obj1 = new Student();
		obj1.setStudent();
		obj1.display();
		
		Student obj2 = new Student();
		obj2.setStudent(1002);
		obj2.display();
		
		Student obj3 = new Student();
		obj3.setStudent("Leo");
		obj3.display();
		
		Student obj4 = new Student();
		obj4.setStudent("Das", 1004);
		obj4.display();
		
		Student obj5 = new Student();
		obj5.setStudent(1005, "Theva");
		obj5.display();
	}
}