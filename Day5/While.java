class While{
	public static void main(String args[]){
		
		int i=0;
		boolean y=true;
		
		while(y){
			if(i<10){
				if(i%2==0){
				System.out.println(i);
			}
			i++;
			} else {
				y=false;
			}
			
			
			
		}
		
	}
}