package ass1;
import java.util.Scanner;
public class mulmatrices {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        
		        // Input matrix size
		System.out.print("Enter rows and columns for matrices: ");
		int n = scanner.nextInt();
		        
		int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
		int[][] result = new int[n][n];
		// Input first matrix
		System.out.println("Enter first matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix1[i][j] = scanner.nextInt();
		            }
		        }
		// Input second matrix
		System.out.println("Enter second matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix2[i][j] = scanner.nextInt();
		            }
		        }
		// Multiplication
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
		                }
		            }
		        }
		        
		// Display result
		System.out.println("Resultant Matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		       scanner.close();
	}
}


