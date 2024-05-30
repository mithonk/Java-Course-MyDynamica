class EmployeeMain{
	public static void main(String args[]){
		
		Employee obj1 = new Employee();
		obj1.setEmployee(1001, "Mithursan", 200000.00);
		obj1.calcBonus();
		obj1.getEmployee();
		
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		
		
		Employee obj2 = new Employee();
		obj2.setEmployee(1002, "Kalanantharasan", 100000.00);
		obj2.calcBonus();
		obj2.getEmployee();
		
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		
		
		Employee obj3 = new Employee();
		obj3.setEmployee(1003, "John", 50000.00);
		obj3.calcBonus();
		obj3.getEmployee();
	}
}