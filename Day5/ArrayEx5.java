class ArrayEx5{
	public static void main(String args[]){
		
		int [] [] x;
		x = new int [3] [3];
		
		x [0][0]=5;
		x [0][1]=10;
		x [1][0]=15;
		x [1][1]=20;
		x [2][0]=25;
		x [2][1]=30;
		
		
		for(int i=0; i<3; i++){
			for(int j=0; j<2; j++){
				System.out.println(x[i][j]);
			}
		}
		
		System.out.println("...................");
		
		System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
		System.out.println(x[2][0]);
		System.out.println(x[2][1]);
		
		
		
		
		
		
	}
}