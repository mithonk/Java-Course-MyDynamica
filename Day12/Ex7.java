// 1
// 22
// 333
// 4444
// 55555


class Ex7{
	public static void main(String args[]){
		
		System.out.println("******While Loop******");
		
		int a = 1;
		
		while(a<=5){
			int b = 1;
			while(b<=a){
				System.out.print(a);
				b++;
			}
			System.out.println();
			a++;
		}
		
		System.out.println("******Do While Loop******");
		
		int x = 1;
		do{
			int y = 1;
			do{
				System.out.print(x);
				y++;
			}while(y<=x);
			x++;
			System.out.println();
		} while(x<=5);
		
		System.out.println("******For Loop******");
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}