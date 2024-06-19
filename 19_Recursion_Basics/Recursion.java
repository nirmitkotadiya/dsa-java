class Recursion {
    public static void numFromNto1(int n) {
        if (n == 1) {
            System.err.print(1);
            return;
        }
        System.out.print(n + " ");
        numFromNto1(n - 1);
    }

    public static void numFrom1toN(int n) {
        if (n == 1) {
            System.err.print(1 + " ");
            return;
        }
        numFrom1toN(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        int fact;
        if (n == 1) {
            return 1;
        }
        fact = n * factorial(n - 1);
        return fact;
    }

    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calcSum(n - 1);
    }

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);

    }

    public static int lastOcuurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        int isFound = lastOcuurence(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int xPown(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xPown(x, n - 1);
    }

    public static int optxPown(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int halfPower = optxPown(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        // odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;

    }

    public static int tilingProblem(int n) { // 2 * n ( floor size )

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // verticle choice
        int fnm1 = tilingProblem(n - 1);
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        System.out.println("charchar " + currChar);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);

        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single
        // int fnm1 = friendsPairing(n - 1);

        // // pair
        // int fnm2 = friendsPairing(n - 2);
        // int pairWays = (n - 1) * fnm2;

        // // totalWays
        // int totWays = fnm1 + pairWays;
        // return totWays;

        // totalways = single + pair
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void printBinStrings(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        // if (lastPlace == 0) {
        // printBinStrings(n - 1, 0, str.append("0"));
        // printBinStrings(n - 1, 1, str.append("1"));
        // } else {
        // printBinStrings(n - 1, 1, str.append("0"));
        // }

        // kaam
        printBinStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // Print numbers from n to 1 (Deceasing Order)
        // numFromNto1(5);

        // Print numbers from 1 to n (Increasing Order)
        // numFrom1toN(5);

        // Print factorial of a number n.
        // System.out.println(factorial(5));

        // Print sum of first n natural numbers.
        // System.out.println(calcSum(5));

        // Print Nth fibonacci number.
        // System.out.println(fibonacci(26));

        // Check if a given array is sorted or not.
        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(isSorted(arr, 0));

        // WAF to find the first occurence of an element in an array.
        // int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        // System.out.println(firstOccurence(arr, 10, 0));

        // WAF to find the last occurence of an element in an array.
        // int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        // System.out.println(lastOcuurence(arr, 5, 0));

        // print x^n
        // System.out.println(xPown(2, 5));

        // Print x^n in O(logn)
        // System.out.println(optxPown(2, 5));

        // Tiling Problem
        // System.out.println(tilingProblem(4));

        // Remove Duplicates in a String
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // Friends Pairing Problem
        // Given n friends , each one can remain single or can be paired up with some
        // other friend. Each friend can be paired only once. Find out the total number
        // of ways in which friends can remain single or can be paired up.
        // System.out.println(friendsPairing(3));

        // Binary Strings Problem
        // Print all binary strings of size N without consecutive ones.
        // printBinStrings(3, 0, "");
    }
}