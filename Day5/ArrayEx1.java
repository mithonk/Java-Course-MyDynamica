import java.util.Scanner;

class ArrayEx1{
	public static void main(String args[]){
		
		int total=0;
		int [] marks;
		marks = new int[5];
				
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<marks.length; i++){
			
			System.out.print("Enter the mark "+(i+1)+" : ");
			marks[i]=scan.nextInt();
			total= total+marks[i];
		}
		
		
	
		
		System.out.println("...............................");
		
		System.out.println("Total Marks : "+total);
		System.out.println("Average of Marks : "+(total/marks.length));
		
	}
}