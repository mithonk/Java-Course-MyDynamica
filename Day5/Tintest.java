// get user ammount, peroid
// ammount > 10laks intest 12%
// ammount > 3laks 7%
//ammount > 1lks 5 %, else 3%


import java.util.Scanner;

class Tintest{
	public static void main(String args[]){
		
		double ammount = 0.00000;
		double period = 0.00000;
		double intest = 0.00000;
		double totalAmmount = 0.00000;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your ammount : ");
		ammount = scan.nextDouble();
		
		System.out.println("How many years you have to calculate the intest : ");
		period = scan.nextDouble();
		
		
		if(ammount>0 && period>0){
			
			for(int i=0; i<period; i++){
				if(ammount>1000000){
					//for(int i=0; i<period; i++){
						intest = ammount*0.12;
					//	ammount = ammount+intest;
		
					//}
					//System.out.println(ammount);
				
				}else if (ammount>300000){
					//for(int i=0; i<period; i++){
						intest = ammount*0.07;
					//	ammount = ammount+intest;
		
					//}
					//System.out.println(ammount);
				} else if (ammount>100000){
					//for(int i=0; i<period; i++){
						intest = ammount*0.05;
					//	ammount = ammount+intest;
		
					//}
					//System.out.println(ammount);
				} else {
					//for(int i=0; i<period; i++){
						intest = ammount*0.03;
					//	ammount = ammount+intest;
		
					//}	
					//System.out.println(ammount);
				}
				ammount = ammount+intest;
			}
				//ammount = ammount+intest;
				System.out.println(ammount);
		} else if (period == 0){
			System.out.println("We don't have to pay intest. Your total ammount is "+ammount+" Rs");
		} else {
			System.out.println("Your input value is not valued");
		}
		
	}
}