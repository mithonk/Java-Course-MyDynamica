// 12345
// 12345
// 12345
// 12345
// 12345


class Ex1{
	public static void main(String args[]){
		
		System.out.println("******While Loop******");
		
		int a = 1;
		
		while(a<=5){
			int b = 1;
			while(b<=5){
				System.out.print(b);
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
				System.out.print(y);
				y++;
			}while(y<=5);
			x++;
			System.out.println();
		} while(x<=5);
		
		System.out.println("******For Loop******");
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}