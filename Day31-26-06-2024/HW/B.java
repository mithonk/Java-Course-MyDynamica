package PackB;
import PackA.A;

public class B extends A{
	int y;
	
	public B(){
		this.y = 20;
	}
	
	public void getY(){
		System.out.println("By : "+this.y);
	}
}