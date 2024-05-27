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
			
			double totalSalary = 0;
			double totalTax = 0;
			System.out.println("Person "+(a+1));
			System.out.println(".........................");
			System.out.println();
			System.out.println();
			for(int b=0; b<12; b++){
				
				double tax = 0;
		
				if(salary[a][b]>=300000){
					
					tax = (salary[a][b])*0.1;
					System.out.println("Your Month "+(b+1)+" Salary : "+salary[a][b]);
					System.out.println("You have to pay 10% tax per month");
					System.out.println("SO, Your Month "+(b+1)+" Tax : "+tax);
					System.out.println(".........................");
					System.out.println();
				}else if (salary[a][b]>= 200000){
		
					tax = (salary[a][b])*0.07;
					System.out.println("Your Month "+(b+1)+" Salary : "+salary[a][b]);
					System.out.println("You have to pay 7% tax per month");
					System.out.println("SO, Your Month "+(b+1)+" Tax : "+tax);
					System.out.println(".........................");
					System.out.println();
				} else if (salary[a][b]>= 100000) {
					
					tax = (salary[a][b])*0.05;
					System.out.println("Your Month "+(b+1)+" Salary : "+salary[a][b]);
					System.out.println("You have to pay 5% tax per month");
					System.out.println("SO, Your Month "+(b+1)+" Tax : "+tax);
					System.out.println(".........................");
					System.out.println();
				} else {
					System.out.println("Your Month "+(b+1)+" Salary : "+salary[a][b]);
					System.out.println("You don't have to pay tax");
					System.out.println(".........................");
					System.out.println();
				}
				
				totalSalary = totalSalary+salary[a][b];
				totalTax = (totalTax+tax); 
				
			}
			System.out.println(".........................");
			System.out.println();
			
			System.out.println("Person "+(a+1)+", 1 Year Total Salary : "+totalSalary);
			System.out.println("Person "+(a+1)+", 1 Year Total Tax : "+totalTax);
			System.out.println("Person "+(a+1)+", 1 Year Total Net Salary : "+(totalSalary-totalTax));
			
			
			System.out.println(".........................");
			System.out.println();
			System.out.println();
		}
		
	}
}