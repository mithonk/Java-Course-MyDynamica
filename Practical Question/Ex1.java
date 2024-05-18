class Ex1{
	public static void main(String args[]){
		
		System.out.println("..........While Loop..........");
		
		int i=1;
		while(i<=5){
			int j=1;
			while(j<=5){
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		
			
		System.out.println("..........While Do Loop..........");
		
		int r=1;
		do{
			int j=1;
			do{
				System.out.print(j);
				j++;
			} while(j<=5);
				System.out.println();
				r++;
		} while(r<=5);
		

		
		System.out.println("..........For Loop..........");
		
		for(int a=1; a<=5; a++){
			for(int b=1; b<=5; b++){
				System.out.print(b);
			}	
			System.out.println();
		}
		
		
	}
}