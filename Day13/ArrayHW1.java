import java.util.Scanner;

class ArrayHW1{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int total=0;
		int [] x;
		x = new int[5];
		
		for(int i=0; i<5; i++){
			System.out.print("Enter the Marks "+(i+1)+" : ");
			x[i] = scan.nextInt();
			total=total+x[i];
		}
		
		System.out.println("Your total marks : "+total);
		System.out.println("Your average marks : "+(total/5.0));
		
	}
}