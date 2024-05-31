import java.util.*;

public class Function {

    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static int calculateSum(int num1, int num2) { // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("swap " + a + " " + b);
    }

    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);

        int binCoeff = n_fact / (r_fact * nmr_fact);
        return binCoeff;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    // only for n >= 2
    public static boolean isPrime(int n) {
        // corner cases
        // 2
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimesinRage(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = (decNum + lastDigit * (int) (Math.pow(2, pow)));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(decNum);
    }

    public static void decToBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) (Math.pow(10, pow)));
            pow++;
            decNum /= 2;
        }
        System.out.print(binNum);
    }

    public static void main(String[] args) {
        // printHelloWorld(); // function call
        // Syntax with Parameters
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b); // arguments or actual parameters
        // System.out.println("sum = " + sum);

        // Call by Value
        // swap - values exchange
        // int a = 5;
        // int b = 10;
        // // swap
        // swap(a, b);
        // System.out.println("main " + a + " " + b);

        // Find Product of a & b
        // int a = 3, b = 5;
        // int product = product(3, 5);
        // System.out.println("Product= " + product);

        // Factorial of a number n
        // int num = 4;
        // System.out.println("Fact is " + factorial(num));

        // Binomial Coefficient
        // System.out.println(binCoeff(5, 2));

        // Function Overloading using Parameters
        // System.out.println(sum(1, 2));
        // System.out.println(sum(1, 3, 4));

        // Function Overloading using Data Types
        // System.out.println(sum(1, 2));
        // System.out.println(sum(1.0f, 2.4f));

        // Check if a number is Prime or not
        // System.out.println(isPrime(2));

        // Print all Primes in Range
        // PrimesinRage(15);

        // Convert from Binary to Decimal
        // binToDec(101);

        // Convert from Decimal to Binary
        // decToBin(15);

        // Scope
        // System.out.println(s); // error
        // int s = 20;
        // System.out.println(s);

        // {
        // int s = 45;
        // }
        // System.out.println(s); // error

    }
}
