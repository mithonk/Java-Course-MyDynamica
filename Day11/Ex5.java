// 11111
// *****
// 33333
// *****
// 55555





class Ex5{
	public static void main(String args[]){
		
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
		
	}
}