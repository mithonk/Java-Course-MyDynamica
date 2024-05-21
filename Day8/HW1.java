import java.util.Scanner;

class HW1{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int mark1 = 0, mark2 = 0, mark3 = 0, total = 0;
		float average = 0;
		
		System.out.print("Enter your mark 1 : ");
		mark1 = scan.nextInt();
		
		System.out.print("Enter your mark 2 : ");
		mark2 = scan.nextInt();
		
		System.out.print("Enter your mark 3 : ");
		mark3 = scan.nextInt();
		
		total = mark1+mark2+mark3;
		average = total/3;
		
		System.out.println("Your total marks : "+total);
		System.out.println("Your average marks : "+average);
		
		if(average>=50){
			System.out.println("Your result is Pass");
		} else {
			System.out.println("Your result is Fail");
		}
		
		
		
	}
}