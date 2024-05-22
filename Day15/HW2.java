// 1lakx<sa 5% month salary
// 2laks<sa 7% month salary
// 3laks<sa 10% month salary
// toatal tax 1 year
// total salary 1 year
// total net salary

import java.util.Scanner;

class HW2{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int NoOfPerson = 0;
		int [][] salary;
		
		
		System.out.print("How many person's tax do you have calculate : ");
		NoOfPerson = scan.nextInt();
		salary = new int[NoOfPerson][12];
		
		
		for(int i=0; i<NoOfPerson; i++){
			salary[i] = new int[12];
			for(int j=0; j<12; j++){
				System.out.print("Enter Person "+(i+1)+" Month "+(j+1)+" Salary : ");
				salary[i][j] = scan.nextInt();
			}
			System.out.println(".........................");
		}
		
		for(int a=0; a<NoOfPerson; a++){
			int totalSalary = 0;
			for(int b=0; b<12; b++){
				totalSalary = totalSalary+salary[a][b];
				
			}
			System.out.println("Person "+(a+1)+", 1 Year Total Salary : "+totalSalary);
		}
		
	}
}