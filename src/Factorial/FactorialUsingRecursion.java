package Factorial;

class FactorialUsingRecursion {
    public static void main(String[] args) {
       System.out.println(calcFactorial(5));
    }

    public static long calcFactorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * calcFactorial(n - 1);
    }
}