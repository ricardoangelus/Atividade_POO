package Fibonacci;

public class Fibonacci {

	public Fibonacci(int i) {
	
		int tp = 1,tu=1,cont,t;
		
		if (i == 1) {
			
			System.out.print(" " + tp);
			
		
		}if (i == 2) {
			
			System.out.print(" " + tp);
			System.out.print(" " + tu);
			
		}else {
			System.out.print(" " + tp);
			System.out.print(" " + tu);
			cont = 3;
			while (cont<=i) {
				t=tp+tu;
				System.out.print(" " + t);
				tp=tu;
				tu=t;
				cont=cont+1;
						
			}
			
		}
		
		
		
	}	
	
}
