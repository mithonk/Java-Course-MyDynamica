class Array{
	public static void main(String args[]){
		
		
		System.out.println("*****Variables*****");
		
		int x;
		x = 10;
		
		System.out.println(x);
		
		System.out.println("*****Array*****");
		
		int [] y;
		y = new int[5];
		y[0]=10;
		y[1]=20;
		y[2]=30;
		y[3]=40;
		y[4]=50;
		
		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(y[2]);
		System.out.println(y[3]);
		System.out.println(y[4]);
		
		System.out.println("*****Loop*****");
		
		for(int z=0; z<5; z++){
			System.out.print(z+" : ");
			System.out.println(y[z]);
		}
		
	}
}