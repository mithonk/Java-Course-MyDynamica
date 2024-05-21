//1 3 6 10 15



class Ex4{
	public static void main(String args[]){
		
		int x = 1;
		int i = 0;
		
		while(x<=15){
			System.out.println(x); //1 3 6
			
			x++;
			i++;
			x= x+i;
			
		}
		
	}
}