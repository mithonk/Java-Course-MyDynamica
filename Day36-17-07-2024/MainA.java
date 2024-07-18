class MainA{
	public static void main(String args[]){
		
		B obj = new B();
		obj.getX();
		obj.getY();
		System.out.println(IA.x);
		IA.x = 5;
	}
}