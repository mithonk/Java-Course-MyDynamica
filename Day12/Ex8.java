// 1
// 23
// 456
// 78910


class Ex8{
	public static void main(String args[]){
		
		System.out.println("******While Loop******");
		
		int a = 1;
		int z1 =1;
		while(a<=4){
			int b = 1;
			while(b<=a){
				System.out.print(z1);
				b++;
				z1++;
			}
			System.out.println();
			a++;
		}
		
		System.out.println("******Do While Loop******");
		
		int z2 = 1;
		int x = 1;
		do{
			int y = 1;
			do{
				System.out.print(z2);
				y++;
				z2++;
			}while(y<=x);
			x++;
			System.out.println();
		} while(x<=4);
		
		System.out.println("******For Loop******");
		
		int z3 = 1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=i; j++){
				System.out.print(z3);
				z3++;
			}
			System.out.println();
		}
		
	}
}