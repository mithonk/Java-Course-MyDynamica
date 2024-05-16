// get user ammount, peroid
// ammount > 10laks intest 12%
// ammount > 3laks 7%
//ammount > 1lks 5 %, else 3%

import java.util.Scanner;

class Intest{
	public static void main(String args[]){
		
		double ammount;
		double period;
		double intest;
		double tatalAmmount;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your tatal ammount : ");
		ammount = scan.nextDouble();
		
		System.out.println("How many years you have to calculate intest : ");
		period = scan.nextDouble();
		
		if(ammount>=0 && period>0){
			if(ammount>1000000){
				
				intest = ammount*0.12*period;
				tatalAmmount = ammount+intest;
				
				System.out.println("Your intest : "+intest+" Rs");
				System.out.println("Your total ammount : "+tatalAmmount+" Rs");
				
			} else if (ammount>300000){
				intest = ammount*0.07*period;
				tatalAmmount = ammount+intest;
				
				System.out.println("Your intest : "+intest+" Rs");
				System.out.println("Your total ammount : "+tatalAmmount+" Rs");
			} else if (ammount>100000){
				intest = ammount*0.05*period;
				tatalAmmount = ammount+intest;
				
				System.out.println("Your intest : "+intest+" Rs");
				System.out.println("Your total ammount : "+tatalAmmount+" Rs");
			} else{
				intest = ammount*0.03*period;
				tatalAmmount = ammount+intest;
				
				System.out.println("Your intest : "+intest+" Rs");
				System.out.println("Your total ammount : "+tatalAmmount+" Rs");
			}
		} else if (period==0){
			System.out.println("You don't have to pay intest. Your total ammount : "+ammount+" Rs");
		}else {
			System.out.println("Your input is not valued");
		}
		
	}
}