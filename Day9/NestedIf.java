class NestedIf{
	public static void main (String args[]){
		
		int marks = 185; 
		
		/*
		if(marks>=0 && marks<=100){
			if((marks>=65) && (marks<=74)){
				System.out.println("B");
			} else if ((marks>=75) && (marks<=100)){
				System.out.println("A");
			} else if ((marks>=55) && (marks<=64)){
				System.out.println("C");
			} else if ((marks>=45) && (marks<=54)){
				System.out.println("D");
			} else if ((marks>=0)&& (marks<=44)){
				System.out.println("F");
			} 
		} else {
			System.out.println("Your marks is error");
		}
		*/
		
		if(marks<0 || marks>100){
			System.out.println("Your marks is error");
		} else {
			if((marks>=65) && (marks<=74)){
				System.out.println("B");
			} else if ((marks>=75) && (marks<=100)){
				System.out.println("A");
			} else if ((marks>=55) && (marks<=64)){
				System.out.println("C");
			} else if ((marks>=45) && (marks<=54)){
				System.out.println("D");
			} else if ((marks>=0)&& (marks<=44)){
				System.out.println("F");
			} 
		}
		
	}
}