import java.util.Scanner;

class ArrayEx2{
	public static void main(String args[]){
		
		int count;
		int total=0;
		//int [] marks;
		//marks = new int[count];
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("No of Subject Marks : ");
		count=scan.nextInt();
		
		int [] marks;
		marks = new int[count];
		
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