class Employee{
	int id;
	String name;
	double basicSalary;
	double bonus;
	
	void setEmployee(int ids, String names, double basicSalarys){
		id = ids;
		name = names;
		basicSalary = basicSalarys;
	}
	
	void calcBonus(){
		if(basicSalary>=100000){
			bonus = basicSalary*0.10;
		} else {
			bonus = basicSalary*0.05;
		}
	}
	
	void getEmployee(){
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Basic Salary : "+basicSalary);
		System.out.println("Employee Bonus Salary : "+bonus);
		System.out.println("Employee Net Salary : "+(basicSalary+bonus));
	}
}