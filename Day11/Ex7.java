// 1
// 22
// 333
// 4444
// 55555

class Ex7{
	public static void main(String args[]){
		
		int x = 1;
		
		while(x<=5){
			int y=1;
			while(y<=x){
				System.out.print(x);
				y++;
			}
			System.out.println();
			x++;
		}
		
	}
}