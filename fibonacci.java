package ass1;

public class fibonacci {

	public static void main(String[] args) {
			int first = 0, second = 1;
		        
		    System.out.println("First 10 Fibonacci numbers:");
		        
		    for (int i = 1; i <= 10; i++) {
		         System.out.print(first + " ");
		         int next = first + second;
		         first = second;
		         second = next;
		    }
	}
}