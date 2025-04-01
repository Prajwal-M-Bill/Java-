package ass1;
import java.util.Scanner;
public class result {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // enter marks
	        System.out.print("Enter marks for Subject 1: ");
	        int subject1 = scanner.nextInt();
	        
	        System.out.print("Enter marks for Subject 2: ");
	        int subject2 = scanner.nextInt();
	        
	        // Checking pass or fail;40 above pass
	        if (subject1 >= 40 && subject2 >= 40) {
	            System.out.println("Candidate Passed!");
	        } else {
	            System.out.println("Candidate Failed.");
	        }
	        scanner.close();
	    }

}
