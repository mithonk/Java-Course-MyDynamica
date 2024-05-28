class MainPen{
	public static void main(String args[]){
		
		int x; //vatiable declaration
		
		Pen p; //Object declaration
		p=new Pen(); // Object constraction / memory allocation
		p.color = "Red"; //. Member access operator
		
		
		p.height = 10.5;
		p.madeIn = "Sri lanka";
		p.price=100;
		p.brand="Ten";
		
		p.write();
		
		System.out.println("Color : "+p.color);
		System.out.println("Height : "+p.height);
		System.out.println("Made In : "+p.madeIn);
		System.out.println("Price : "+p.price);
		System.out.println("Brand : "+p.brand);
		
	}
}