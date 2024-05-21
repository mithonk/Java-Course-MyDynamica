import java.util.Scanner;

class MarksInput{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int mark=0;
		
		System.out.print("Enter your mark : ");
		mark = scan.nextInt();
		
		if(mark>=50){
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	}
}