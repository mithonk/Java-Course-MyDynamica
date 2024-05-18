class Array{
	public static void main(String args[]){
		
		int [] x; //Array Declaration
		x=new int[5]; //Array Construction
		
		//Array Initialization
		
		x[0]=20;
		x[1]=15;
		x[2]=10;
		x[3]=5;
		x[4]=1;
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		
		
		System.out.println("..................");
		
		
		for(int i=0; i<5; i++){
			System.out.print(i+" : ");
			System.out.println(x[i]);
		}
		
		
	}
}