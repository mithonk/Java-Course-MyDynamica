import java.util.Scanner;

class Ifelse{
	public static void main ( String args[]){

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the your English mark :");
		int mark = in.nextInt();
		
		if(mark<=100 && mark>=0) {
			if(mark>=75){
				System.out.println("You got 'A' credit");
			}
			else if(mark>=65){
				System.out.println("You got 'B' credit");
			}
			else if(mark>=50){
				System.out.println("You got 'C' credit");
			}
			else if(mark>=40){
				System.out.println("You got 'D' credit");
			}
			else {
				System.out.println("You got 'F' credit");
			}
		
		} else {
			System.out.println("You mark is not valued");
		}

	}
}