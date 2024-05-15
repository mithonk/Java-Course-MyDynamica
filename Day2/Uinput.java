import java.util.Scanner;


class Uinput{
	public static void main ( String args[]){
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the your name :");
		String name = in.nextLine();
		
		System.out.println("Your name is :"+name);
		
	}
}