class B extends A{
	int y;
	int x;
	
	B(){
		this.y = 30;
		this.x = 5;
	}
	
	void getY(){
		System.out.println("By :"+this.y);
	}
	
	/*
	void getX(){
		super.getX();
		System.out.println("Bx : "+this.x);
	}
	*/
	
	void getX(int x){
		getX();
		System.out.println("PAx : "+x);
	}
}