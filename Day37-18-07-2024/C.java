class C extends B implements IA, ID {
	int z;
	
	C(){
		this.z = 20;
	}
	
	public void getX(){
		System.out.println("IAx : "+this.x);
	}
	
	public void getM(){
		System.out.println("IDm : "+this.m);
	}
	
	void getZ(){
		System.out.println("Cz : "+this.z);
	}
}