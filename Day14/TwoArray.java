class TwoArray{
	public static void main(String args[]){
		
		int [][] x;
		x = new int[3][2];
		
		x[0][0] = 10;
		x[0][1] = 20;
		
		x[1][0] = 30;
		x[1][1] = 40;
		
		x[2][0] = 50;
		x[2][1] = 60;
		
		System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
		
		System.out.println(x[2][0]);
		System.out.println(x[2][1]);
		
		for(int i=0; i<3; i++){
			for(int j=0; j<2; j++){
				System.out.println(x[i][j]);
			}
		}
		
	}
}