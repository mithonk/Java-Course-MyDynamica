class While3{
	public static void main(String args[]){
		
		int a=1;
		int b=a;
		
		while(b<=15){
			System.out.println(b);
			a++;
			b+=a;
		}
		
		
	}
}
 
// 1 a1 b1

// 3 2 3

// 6 3 6

// 10 4 10

// 15 5 15