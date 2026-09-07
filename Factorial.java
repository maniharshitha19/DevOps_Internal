public class Factorial {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String args[]){
        Factorial factorial = new Factorial();
        System.out.println("Factorial of 5 is: "+ factorial.factorial(5) );
        System.out.println("Factorial of 1 is: "+ factorial.factorial(1) );
    }
}
