import java.util.*;

class Arrays {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    // Linear Search
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }

    // Largest Number in Array
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest Number is " + smallest);

        return largest;
    }

    public static int binary_search(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            }
            if (numbers[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }

    }

    public static void pairs_arrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void printSubarrays(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // subarray sum
                    currSum += numbers[k];
                }
                System.out.print(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum " + maxSum);
    }

    public static void prefixSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum " + maxSum);

    }

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);

        }
        System.out.println("max subarray sum is " + ms);
    }

    public static int trappedRainwater(int height[]) {
        // calculate left max boundary - array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // calculate right max boundary - array

        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // loop

        int trapperWater = 0;

        for (int i = 0; i < height.length; i++) {
            // waterLevel = min(leftmax bound, rightmax bound )
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            // trapped water = waterLevel - height[i]
            trapperWater += waterLevel - height[i];
        }

        return trapperWater;

    }

    public static int buyAndSellStocks(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) { // profit
                int profit = price[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // Creating an Array

        // int marks[] = new int[50];
        // int numbers[] = { 1, 2, 3 };

        // Input Output Update
        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("marks length " + marks.length);
        // int phy;
        // phy = sc.nextInt()

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Phy " + marks[0]);
        // System.out.println("Chem " + marks[1]);
        // System.out.println("Maths " + marks[2]);

        // marks[2] = 100;
        // System.out.println("Maths " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage " + percentage + "%");

        // Passing arrays as

        // int marks[] = { 97, 98, 99 };
        // update(marks);

        // for (int i = 0; i < marks.length; i++) {
        // System.out.print(marks[i] + " ");
        // }

        // Linear Search
        // Time Complexity => O(n)

        // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int key = 10;

        // int index = linearSearch(numbers, key);
        // if (index == 1) {
        // System.out.println("key not exists in array");
        // } else {
        // System.out.println("key is at index: " + index);
        // }

        // Largest Number
        // int numbers[] = { 2, 4, 6, 8, 10, 54212, 14, 16 };
        // System.out.println("Largest Number is " + getLargest(numbers));

        // Binary Search in Array
        // int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        // int key = 10;

        // System.out.println("key index is " + binary_search(numbers, key));

        // Reverse an Array
        // int numbers[] = { 2, 4, 6, 8, 10 };

        // reverse(numbers);
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }

        // Pairs in an Array
        // int numbers[] = { 2, 4, 6, 8, 10 };
        // pairs_arrays(numbers);

        // Print Subarrays
        // Max Subarray Sum
        // int numbers[] = { 1, -2, 6, -1, 3 };
        // printSubarrays(numbers);

        // Max Subarray Sum Prefix Sum
        // int numbers[] = { 1, -2, 6, -1, 3 };
        // prefixSum(numbers);

        // Kadane's Algorithm -> Max Subarray Sum
        // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // kadanes(numbers);

        // Trapping Rainwater
        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // System.out.println(trappedRainwater(height));

        // Buy & Sell Stocks
        int prices[] = { 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
    }
}
