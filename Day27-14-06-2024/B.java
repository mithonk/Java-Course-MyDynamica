class B extends A{
	//int x;
	int y;
	
	B(int y, int x){
		super(x);
		this.y = y;
		this.x = 25;
	}
	
	void getY(){
		System.out.println("------------------");
		//super.getX();
		this.getX();
		System.out.println("BY : "+this.y);
	}
	

	void getX(){
		System.out.println("+++++++START++++++++++++++");
		super.getX();
		System.out.println("BX : "+this.x);
		System.out.println("AX : "+super.x);
		System.out.println("++++++++++END+++++++++++++");
	}
	
}
