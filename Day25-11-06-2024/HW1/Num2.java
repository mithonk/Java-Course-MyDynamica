class Num2 extends Num1 {
	int y;
	
	Num2(int y){
		this.y = y;
	}
	
	void getY(){
		System.out.println("Y : "+this.y);
	}
	
	void addXY(){
		int z = this.x+this.y;
		System.out.println("X+Y : "+z);
	}
}