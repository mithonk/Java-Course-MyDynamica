class Ex4{
	public static void main(String args[]){
		
		int x = 1;
		
		while(x<=5){
			int y = 1;
			while(y<=5){
				if(y==5){
					System.out.print("5");
				} else {
					System.out.print(y+"*");
				}
				y+=2;
			}
			x++;
			System.out.println();
		}
		
	}
}