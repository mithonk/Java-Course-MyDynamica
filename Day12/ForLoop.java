class ForLoop{
	public static void main(String args[]){
		
		System.out.println("*****While Loop*****");
		
		int x = 1;
		
		while(x<=5){
			System.out.println(x);
			x++;
		}
		
		System.out.println("*****For Loop*****");
		
		for(int y = 1; y<=5; y++){
			System.out.println(y);
		}
		
		System.out.println("*****Do While Loop*****");
		
		int z = 1;
		
		do{
			System.out.println(z);
			z++;
		} while(z<=5);
		
	}
}