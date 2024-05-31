class EmployeeMain{
	public static void main(String args[]){
		
		Employee obj1 = new Employee(1001, "Mithursan", 200000.00);
		obj1.calcBonus();
		obj1.display();
		
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		
		
		Employee obj2 = new Employee(1002, "Kalanantharasan", 100000.00);
		obj2.calcBonus();
		obj2.display();
		
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		
		
		Employee obj3 = new Employee(1003, "John", 50000.00);
		obj3.calcBonus();
		obj3.display();
	}
}