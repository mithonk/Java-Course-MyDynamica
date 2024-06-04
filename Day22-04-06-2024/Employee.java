class Employee{
	int id;
	String name;
	double basicSalary;
	
	Employee(int id, String name, double basicSalary){
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	double calcBonus(){
		double bonus = 0.00;
		if(this.basicSalary>=100000){
			bonus = this.basicSalary*0.10;
		} else {
			bonus = this.basicSalary*0.05;
		}
		return bonus;
	}
	
	void display(){
		System.out.println("Employee ID : "+this.id);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Basic Salary : "+this.basicSalary);
		double bo = this.calcBonus();
		double netSalary = this.basicSalary+bo;
		System.out.println("Employee Bonus Salary : "+bo);
		System.out.println("Employee Net Salary : "+netSalary);
	}
}