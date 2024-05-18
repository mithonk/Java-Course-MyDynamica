import java.util.Scanner;

class ArrayEx6{
	public static void main(String args[]){
		
		int total=0;
		
		Scanner scan = new Scanner(System.in);
		int [] [] marks;
		marks = new int [5] [3];
		
		for(int i=0; i<marks.length; i++){
			for(int j=0; j<marks[j].length; j++){
				System.out.print("Student "+(i+1)+" Mark "+(j+1)+": ");
				marks[i][j]=scan.nextInt();
				total=total+marks[i][j];
				
			}
			System.out.println("Student "+(i+1)+" total marks : "+total);
			System.out.println("Student "+(i+1)+" average marks : "+(total/3));
			
			if((total/3)>75){
				System.out.println("Your credit : A");
			} else if((total/3)>65){
				System.out.println("Your credit : B");
			} else if((total/3)>50){
				System.out.println("Your credit : C");
			} else if((total/3)>45){
				System.out.println("Your credit : D");
			} else {
				System.out.println("Your credit : F");
			}
			
			
			
			total = 0;
			
			System.out.println("...............");
		}
		

		
	}
}

/*

					for(int r=0; j<marks[r].length; r++){
						int total;
						total=total+marks[i][j];
						System.out.println("Total marks of student "+(i+1)+" : "+total);




		for(int i=0; i<marks.length; i++){
			for(int j=0; j<marks[j].length; j++){
				System.out.println("Student "+(i+1)+" Mark "+(j+1)+": "+marks[i][j]);
				
			}

				int total=0;
				//for(int r=0; r<marks[r].length; r++){
					
					
					
				total=total+marks[i][r];	
				
				}

				System.out.println(total);


				
			System.out.println("...............");
		}



*/