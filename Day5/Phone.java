// phoe call culculation
//get 1 input user now many minutes,
// minutes 1-30min 1.5 rs per unit
//31-60 1rs
// min>60 0.5 rs

import java.util.Scanner;
class Phone{
	public static void main(String args[]){
		
		double min = 0.0;
		double ammount = 0.0;

			
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many minutes you talked : ");
		min = scan.nextDouble();
		
		if(min>=0){
			if(min>60){
				ammount=(30*1.5)+(30*1)+((min-60)*0.5);
				//ammount = 0.5*min;
			
				//System.out.println("Your phone bill : "+ammount+" Rs");
			
			} else if (30<min && min<=60) {
				ammount=(30*1.5)+((min-30)*1);
				//ammount = 1*min;
			
				//System.out.println("Your phone bill : "+ammount+" Rs");
			} else {
				
				ammount = 1.5*min;
			
				//System.out.println("Your phone bill : "+ammount+" Rs");		
			}
			
			System.out.println("Your phone bill : "+ammount+" Rs");
			
		} else {
			System.out.println("Your input is not valued");
		}
		
	}
} 