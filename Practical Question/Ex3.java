class Ex3{
	public static void main(String args[]){
		
		System.out.println("..........While Loop..........");
		
		int i=1;
		while(i<=5){
			int j=5;
			while(j>0){
				System.out.print(j);
				j--;
			}
			System.out.println();
			i++;
		}
		
			
		System.out.println("..........While Do Loop..........");
		
		int r=1;
		do{
			int j=5;
			do{
				System.out.print(j);
				j--;
			} while(j>0);
				System.out.println();
				r++;
		} while(r<=5);
		

		
		System.out.println("..........For Loop..........");
		
		for(int a=1; a<=5; a++){
			for(int b=5; b>0; b--){
				System.out.print(b);
			}	
			System.out.println();
		}
		
		
	}
}