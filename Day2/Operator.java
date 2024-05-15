class Operator{
	public static void main(String args[]){
		int x = 10;
		int y = 5;
		
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		
		System.out.println("X+Y : "+x+y);
		System.out.println("X+Y : "+(x+y));
		System.out.println(x+y+"(x+y)");
		
		//System.out.println("X+Y : "+x-y);
		System.out.println("X+Y : "+(x-y));
		System.out.println(x-y+"(x+y)");
		
		
		System.out.println("X*Y : "+x*y);
		System.out.println("X*Y : "+(x*y));
		System.out.println(x*y+"(x*y)");
		
		System.out.println("X/Y : "+x/y);
		System.out.println("X/Y : "+(x/y));
		System.out.println(x/y+"(x/y)");
		
		
		
		char a = 'A';
		char b = 'B';
		
		System.out.println((int)a);
		System.out.println((int)b);
		
		System.out.println(""+a+b);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		int n = 20;
		
		System.out.println(n++);
		System.out.println(n);
		System.out.println(++n);
		System.out.println(n--);
		System.out.println(--n);
		
		
		System.out.println(".....................");
		
		//x+=5
		//x-=5
		//x*=5
		//x/=5
		//x%=5
		
		int m = 20;
		int r = 5;
		
		System.out.println(m+=r);
		System.out.println(m-=5);
		System.out.println(m*=5);
		System.out.println(m/=5);
		System.out.println(m%=5);
		
		System.out.println(".....................");
		
		//int x = 10;
		//int y = 5;
		
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x>y);
		System.out.println(x>=y);
		System.out.println(x<y);
		System.out.println(x<=y);
		
		System.out.println(".....................");
		
		boolean t = true;
		boolean f = false;
		
		System.out.println(t && f);
		System.out.println(t || f);
		System.out.println(!t);
		System.out.println(!f);
		
		
		System.out.println(".....................");
		
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(".....................");
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(".....................");
		
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(".....................");
		
		//int x = 10;
		//int y = 5;
		
		System.out.println(x>10 && y==5 );
		
		
		}
	}