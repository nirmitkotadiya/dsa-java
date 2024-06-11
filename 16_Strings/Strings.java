import java.util.Scanner;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                // not a palindrome
                System.out.println("not Palindrome");

                return false;
            }

        }
        System.out.println("Palindrome");
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }

        }
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void largestString(String str[]) {
        String largest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println("Largest = " + largest);
    }

    public static String firstLetterCaptial(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String strCompression(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        // concatenation
        // String firstName = "Nirmit";
        // String lastName = "Kotadiya";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // charAt
        // System.out.println(fullName.charAt(0));
        // printLetters(fullName);

        // Palindrome
        // String str = "racecar";
        // palindrome(str);

        // Shortest path to reach destination
        // String path = "WNEENESENNN";
        // String path = "NSEWNNE";
        // System.out.println(getShortestPath(path));

        // String Compare

        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");
        // if (s1 == s2) {
        // System.out.println("String are equal");
        // } else {
        // System.out.println("String are not equal");
        // }

        // if (s1 == s3) {
        // System.out.println("String are equal");
        // } else {
        // System.out.println("String are not equal");
        // }

        // if (s1.equals(s3)) {
        // System.out.println("String are equal");
        // } else {
        // System.out.println("String are not equal");
        // }

        // Substring
        // String str = "Hello World";
        // System.out.println(str.substring(0, 5));
        // System.out.println(substring(str, 0, 5));

        // Largest String => Lexicographic
        // String fruits[] = { "apple", "mango", "banana" };
        // largestString(fruits);

        // StringBuilder
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // } // abcdefghijklmnopqrstuvwxyz //O(26)
        // System.out.println(sb);
        // System.out.println(sb.length());

        // String convert each first letter of each word to uppercase
        // String str = "hi, i am nirmit kotadiya";
        // System.out.println(firstLetterCaptial(str));

        // String Compression
        // String str = "aaabbcccdd";
        // System.out.println(strCompression(str));
    }
}
