// 55555
// 44444
// 33333
// 22222
// 11111


class Ex2{
	public static void main(String args[]){
		
		System.out.println("******While Loop******");
		
		int a = 5;
		
		while(a>=1){
			int b = 1;
			while(b<=5){
				System.out.print(a);
				b++;
			}
			System.out.println();
			a--;
		}
		
		System.out.println("******Do While Loop******");
		
		int x = 5;
		do{
			int y = 1;
			do{
				System.out.print(x);
				y++;
			}while(y<=5);
			x--;
			System.out.println();
		} while(x>=1);
		
		System.out.println("******For Loop******");
		
		for(int i=5; i>=1; i--){
			for(int j=1; j<=5; j++){
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}