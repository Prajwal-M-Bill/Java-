package ass1;

public class withoutoperator {
    
    // Multiplication using repeated addition
    public static int multiply(int a, int b) {
        int result = 0;
        boolean negative = (b < 0);
        if (negative) b = -b;
        
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return negative ? -result : result;
    }

    // Division using repeated subtraction
    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
        
        int count = 0;
        boolean negative = (a < 0) ^ (b < 0);  // XOR to check if signs differ
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (a >= b) {
            a -= b;
            count++;
        }
        return negative ? -count : count;
    }

    public static void main(String[] args) {
        int x = 6, y = 3;
        System.out.println("Multiply: " + multiply(x, y));  // Output: -18
        System.out.println("Divide: " + divide(x, y));      // Output: -2
    }
}