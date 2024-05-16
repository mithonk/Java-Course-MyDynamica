//1*3*5
//1*3*5*
class While6{
	public static void main(String args[]){
		
		int i=1;
		
		while(i<5){
			if(i%2==1){
				if(i==5){
					System.out.print(i);
				} else {
					System.out.print(i+"*");
				}
			}
			i++;
		}
		
	}
}