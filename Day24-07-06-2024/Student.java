class Student{
	int id;
	String name;
	int marks1;
	int marks2;
	int marks3;
		
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void setMarks(int marks1, int marks2, int marks3){
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	int calTotal(){
		int total = this.marks1+this.marks2+this.marks3;
		return total;
	}
	
	double calAvg(int t){
		double avg = t/3.0;
		return avg; 
	}
	
	char getResult(double a){
		char result = '\u0000';
		
		if(a>=75){
			result = 'A';
		} else if(a>=65){
			result = 'B';
		} else if(a>=55){
			result = 'C';
		} else if(a>=45){
			result = 'D';
		} else {
			result = 'F';
		}
		
		return result;
	}
	
	void display (){
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Marks 1 : "+this.marks1);
		System.out.println("Marks 2 : "+this.marks2);
		System.out.println("Marks 3 : "+this.marks3);
		 
		int tot = this.calTotal();
		double avg = this.calAvg(tot);
		char result = this.getResult(avg);
		
		System.out.println("Total : "+tot);
		System.out.println("Average : "+avg);
		System.out.println("Result : "+result);
	}
}