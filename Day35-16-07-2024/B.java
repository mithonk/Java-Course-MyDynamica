class B extends A{
	int y;
	
	B(){
		this.y = 25;
	}
	
	void getX(){
		System.out.println("Bx : "+this.x);
	}
	
	void getY(){
		System.out.println("By : "+this.y);
	}
}