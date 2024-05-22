// 1
// 23
// 456
// 78910


class Ex8{
	public static void main(String args[]){
		
		int a = 1;
		int z1 =1;
		
		while(a<=4){
			int b = 1;
			while(b<=a){
				System.out.print(z1);
				b++;
				z1++;
			}
			System.out.println();
			a++;
		}

	}
}