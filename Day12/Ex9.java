// 55555
// 4444
// 333
// 22
// 1


class Ex9{
	public static void main(String args[]){
		
		System.out.println("******While Loop******");
		
		int a = 5;
		
		while(a>=1){
			int b = 1;
			while(b<=a){
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
			}while(y<=x);
			x--;
			System.out.println();
		} while(x>=1);
		
		System.out.println("******For Loop******");
		
		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}