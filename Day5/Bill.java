// total bill ammoun user
// ammount< 10000 no tax
// 1laks > amm> 10000 3% tax
//amm>1laks  15%

//tax, net ammout


import java.util.Scanner;
class Bill{
	public static void main(String args[]){
		
		double tax = 0.0;
		double netAmmount=0.0;
		double ammount=0.0;
			
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your bill ammount : ");
		ammount = scan.nextDouble();
		
		if(ammount>=0){
			if(ammount>100000){
				tax = (ammount*(15.0/100.0));
				netAmmount = tax + ammount;
			
				//System.out.println("Your tax : "+tax+" Rs");
				//System.out.println("Your Net Ammount : "+netAmmount+" Rs");
			
			} else if (10000<ammount && ammount<=100000) { 
				tax = (ammount*0.03);
				netAmmount = tax + ammount;
			
				//System.out.println("Your tax : "+tax+" Rs");
				//System.out.println("Your Net Ammount : "+netAmmount+" Rs");
			} 		
						
			else {
				System.out.println("You don't have to pay tax. Your net ammount is "+ammount+" Rs");
			}
		
				System.out.println("Your tax : "+tax+" Rs");
				System.out.println("Your Net Ammount : "+netAmmount+" Rs");
		
		
		} else {
			System.out.println("Your input is not valued");
		}
		
	}
}