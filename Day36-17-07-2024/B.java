class B implements IA{
	int y;
	
	B(){
		this.y = 10;
	}
	
	public void getX(){
		System.out.println("IAx : "+this.x);
	}
	
	void getY(){
		System.out.println("By : "+this.y);
	}
}