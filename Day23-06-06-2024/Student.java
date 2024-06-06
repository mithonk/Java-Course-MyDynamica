import java.util.Scanner;

class Student {
	int id;
	String name;
	int marks1;
	int marks2;
	int marks3;
	
	Scanner scan = new Scanner(System.in);
	
	Student(){
		System.out.print("Enter Your ID : ");
		this.id = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("Enter Your Name : ");
		this.name = scan.nextLine();
	}
	
	void setMarks(){
		
		System.out.print("Enter Marks 1 : ");
		this.marks1 = scan.nextInt();
		
		System.out.print("Enter Marks 2 : ");
		this.marks2 = scan.nextInt();
		
		System.out.print("Enter Marks 3 : ");
		this.marks3 = scan.nextInt();
	}
	
	int calTotal(){
		int total = marks1+marks2+marks3;
		return total;
	}
	
	double calAvg(int total){
		double average = total/3;
		return average;
	}
	
	char getResult(double average){
		char result;
		if(average>=75){
			result = 'A';
		} else if(average>=65){
			result = 'B';
		} else if(average>=55){
			result = 'C';
		} else if(average>=45){
			result = 'D';
		} else {
			result = 'F';
		}
		return result;
	}
	
	void display(){
		System.out.println("Student ID : "+this.id);
		System.out.println("Student Name : "+this.name);
		System.out.println("Student Marks 1 : "+this.marks1);
		System.out.println("Student Marks 2 : "+this.marks2);
		System.out.println("Student Marks 3 : "+this.marks3);
		int total = this.calTotal();
		System.out.println("Student Total Marks : "+total);
		double average = this.calAvg(total);
		System.out.println("Student Average Marks : "+average);
		char result = this.getResult(average);
		System.out.println("Student Result : "+result);
		
		
	}
}