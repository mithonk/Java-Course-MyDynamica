// 1
// 23
// 456
// 6789


class Ex8{
	public static void main(String args[]){
		
		int x = 1;
		
		while(x<=10){
			int y = 1;
			while(y<=x){
				System.out.print(x);
				y++;
				x++;
			}
			System.out.println();
		}
		
	}
}