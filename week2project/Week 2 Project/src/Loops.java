
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		
		while (a <= 100) {
	
			System.out.println(a);
				a+=2;
	
	
	
		int b = 100;
				
		while (b >= 0) {
			
			System.out.println(b);
		
			b -= 3;
	
	
		
			for (int c = 0; c < 100; c += 2) {
			
			System.out.println(c);
	}
		
		
		for (int d = 0; d <= 100; d++) {
		
		
			if (d % 3 == 0 && d % 5 == 0) {
				 
				System.out.println("HelloWorld");
				
			}
				
			else if (d % 3 == 0) {
				
			 System.out.println("Hello");
			 
			}
			
			else if (d % 5 == 0) {	
				
				System.out.println("World");
				
			}
			
			
			else {
				
				System.out.println(d);
			}
			
		}

		
	}



}
	
} 
}