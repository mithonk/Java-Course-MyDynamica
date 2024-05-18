class Ex2{
	public static void main(String args[]){
		
		System.out.println("..........While Loop..........");
		
		int i=5;
		while(i>0){
			int j=1;
			while(j<=5){
				System.out.print(i);
				j++;
			}
			System.out.println();
			i--;
		}
		
			
		System.out.println("..........While Do Loop..........");
		
		int r=5;
		do{
			int j=1;
			do{
				System.out.print(r);
				j++;
			} while(j<=5);
				System.out.println();
				r--;
		} while(r>0);
		

		
		System.out.println("..........For Loop..........");
		
		for(int a=5; a>5; a--){
			for(int b=1; b<=5; b++){
				System.out.print(a);
			}	
			System.out.println();
		}
		
		
	}
}