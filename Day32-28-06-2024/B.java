package B;
import A.A;

public class B extends A{
	int y;
	
	public B(){
		this.y = 20;
	}
	
	public void getY(){
		super.getX();
		System.out.println("By : "+this.y);
	}
}