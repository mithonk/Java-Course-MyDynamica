class MainA{
	public static void main(String args[]){
		A obj = new A();
		obj.getX();
		
		//A obj2 = new A();
		//obj2.getX();
		
		A.x = 15;
		A.getX();
		
		obj.getX();
		obj.x = 25;
		A.getX();
		obj.getX();
	}
}