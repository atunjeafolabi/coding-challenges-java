package PrimeNumber;

/**
 * Check if a given number is prime
 */
class CheckPrime {
    public static void main(String[] args) {
        int num = 29;

        for(int i=2; i < num/2; i++) {      // Math.sqrt(num) also works in place of num/2
            if(num % i == 0) {
                System.out.println(String.format("%s is NOT a prime number", num));
                return;
            }
        }

        System.out.println(String.format("%s is a prime number", num));
    }
}