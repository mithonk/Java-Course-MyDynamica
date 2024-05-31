class Employee{
	int id;
	String name;
	double basicSalary;
	double bonus;
	
	Employee(int id, String name, double basicSalary){
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	void calcBonus(){
		if(this.basicSalary>=100000){
			this.bonus = this.basicSalary*0.10;
		} else {
			this.bonus = this.basicSalary*0.05;
		}
	}
	
	void display(){
		System.out.println("Employee ID : "+this.id);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Basic Salary : "+this.basicSalary);
		System.out.println("Employee Bonus Salary : "+this.bonus);
		System.out.println("Employee Net Salary : "+(this.basicSalary+this.bonus));
	}
}