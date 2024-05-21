// 1*3*5
// 1*3*5
// 1*3*5
// 1*3*5
// 1*3*5


class Ex4{
	public static void main(String args[]){
		
		System.out.println("******While Loop******");
		
		int a = 1;
		
		while(a<=5){
			int b = 1;
			while(b<=5){
				if(b==5){
					System.out.print(b);
				}else {
					System.out.print(b+"*");
				}
				b+=2;
			}
			System.out.println();
			a++;
		}
		
		System.out.println("******Do While Loop******");	
		
		int x = 1;
		do{
			int y = 1;
			do{
				if(y==5){
					System.out.print(y);
				}else {
					System.out.print(y+"*");
				}
				y+=2;
			}while(y<=5);
			x++;
			System.out.println();
		} while(x<=5);
		
		System.out.println("******For Loop******");
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j+=2){
				if(j==5){
					System.out.print(j);
				}else {
					System.out.print(j+"*");
				}
			}
			System.out.println();
		}
		
	}
}