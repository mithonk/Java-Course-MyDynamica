abstract class A {
	int x;
	
	A(){
		this.x = 15;
	}
	
	//abstract void getX(){
	//	System.out.println("Ax : "+this.x);
	//}
	
	abstract void getX();
	
	void getA(){
		System.out.println("A");
	}
}