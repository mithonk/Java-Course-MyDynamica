import java.util.Scanner;

class HW1{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int [][] marks;
		marks = new int[5][3];
		
		for(int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				System.out.print("Enter the Student "+(i+1)+" Marks "+(j+1)+" : ");
				marks[i][j]=scan.nextInt();
			}
			System.out.println("-----------------------------------");
		}
		
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		
		int total = 0;
		for(int a=0; a<5; a++){
			total=0;
			for(int b=0; b<3; b++){
				total = total+marks[a][b];
			}
			System.out.println("Student "+(a+1)+" Total Marks : "+total);
			System.out.println("Student "+(a+1)+" Average Marks : "+(total/3.0));
			System.out.println("====================================");
		}
		
	}
}