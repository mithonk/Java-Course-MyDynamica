import java.util.Scanner;

class HW1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
	
		int [][] marks;
		marks = new int[5][];
	
	
	
		for(int i=0; i<5; i++){
			int count = 0;
			System.out.print("How many subject do you study : ");
			count = scan.nextInt();
			marks[i] = new int[count];
		
			for(int j=0; j<count; j++){
				System.out.print("Enter Student "+(i+1)+" Marks "+(j+1)+" : ");
				marks[i][j]=scan.nextInt();
			}
			
		System.out.println("-----------------------");
	}
	
		for(int i=0; i<5; i++){
			int total = 0;
			for(int j=0; j<marks[i].length; j++){
				total = total+marks[i][j];
			}
			
			System.out.println("Student "+(i+1)+" heve "+(marks[i].length)+" Subjects");
			System.out.println("Student "+(i+1)+" Total Marks : "+total);
			System.out.println("Student "+(i+1)+" Average Marks : "+(total/marks[i].length));
			System.out.println("============================");
		}
	
	
	
	}
}