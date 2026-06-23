public class PrimeChecker {
    public boolean isPrime(int n) {
         int nums = 0;

         for(int i = 0; i<= n; i++) {
            if (n % i == 0) {
                nums++;
            }
         }
         return nums == 2;
    }

public class Main {
    public static void main(String[] args) {
        int n = 5; 
        PrimeChecker obj = new PrimeChecker();
        boolean isPrime = obj.isPrime(n); 

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
}