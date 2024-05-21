// 54321
// 54321
// 54321
// 54321
// 54321


class Ex3{
	public static void main(String args[]){
		
		System.out.println("******While Loop******");
		
		int a = 1;
		
		while(a<=5){
			int b = 5;
			while(b>=1){
				System.out.print(b);
				b--;
			}
			System.out.println();
			a++;
		}
		
		System.out.println("******Do While Loop******");	
		
		int x = 1;
		do{
			int y = 5;
			do{
				System.out.print(y);
				y--;
			}while(y>=1);
			x++;
			System.out.println();
		} while(x<=5);
		
		System.out.println("******For Loop******");
		
		for(int i=1; i<=5; i++){
			for(int j=5; j>=1; j--){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}