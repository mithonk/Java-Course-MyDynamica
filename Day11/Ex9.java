// 55555
// 4444
// 333
// 22
// 1

class Ex9{
	public static void main(String args[]){
		
		int x = 5;
		
		while(x>=0){
			int y = 1;
			while(y<=x){
				System.out.print(x);
				y++;
			}
			System.out.println();
			x--;
		}
		
	}
}