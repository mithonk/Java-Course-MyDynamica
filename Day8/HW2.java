import java.util.Scanner;

class HW2{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int mark1 = 0, mark2 = 0, mark3 = 0, total = 0;
		float average = 0;
		
		System.out.print("Enter your maths mark : ");
		mark1 = scan.nextInt();
		
		System.out.print("Enter your english mark : ");
		mark2 = scan.nextInt();
		
		System.out.print("Enter your science mark : ");
		mark3 = scan.nextInt();
		
		total = mark1+mark2+mark3;
		average = total/3;
		
		System.out.println("Your total marks : "+total);
		System.out.println("Your average marks : "+average);
		
		if(average>=75){
			System.out.println("Your result is A");
		} else if (average>=65) {
			System.out.println("Your result is B");
		} else if (average>=55){
			System.out.println("Your result is C");
		} else if (average>=45){
			System.out.println("Your result is D");
		} else {
			System.out.println("Your result is F");
		}
		
		
		
	}
}