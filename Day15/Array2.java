class Array2{
	public static void main(String args[]){
		
		int [][] x;
		x = new int[3][];
		
		x[0] = new int[4];
		x[1] = new int[3];
		x[2] = new int[2];
		
		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;
		x[0][3] = 40;
		
		x[1][0] = 50;
		x[1][1] = 60;
		x[1][2] = 70;
		
		x[2][0] = 80;
		x[2][1] = 90;
		
		for(int i=0; i<3; i++){
			System.out.println("*****"+(x[i].length)+"*****");
			for(int j=0; j<x[i].length; j++){
				System.out.println(x[i][j]);
			}
			System.out.println("**********");
		}
		
	}
}