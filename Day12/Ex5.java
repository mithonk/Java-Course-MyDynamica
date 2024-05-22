// 11111
// *****
// 33333
// *****
// 55555


class Ex5{
	public static void main(String args[]){
		
		System.out.println("******While Loop******");
		
		int a = 1;
		
		while(a<=5){
			int b = 1;
			while(b<=5){
				System.out.print(a);	
				b++;
			}
			System.out.println();
			if(a<5){
			System.out.println("*****");
			}
			a+=2;
		}
		
		System.out.println("******Do While Loop******");	
		
		int x = 1;
		do{
			int y = 1;
			do{
				System.out.print(x);	
				y++;
			}while(y<=5);
				System.out.println();
				if(x<5){
					System.out.println("*****");
				}
			x+=2;
		} while(x<=5);
		
		System.out.println("******For Loop******");
		
		for(int i=1; i<=5; i+=2){
			for(int j=1; j<=5; j++){
				System.out.print(i);
			}
			System.out.println();
				if(i<5){
					System.out.println("*****");
				}
		}
		
	}
}