public class Patterns_II {
    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || j == 1 || i == totRows || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_numbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }

    public static void zero_one_traingle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n) {
        // 1st Half
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces => 2 * (n-i)

            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for (int i = n; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces

            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void solid_rhombus_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void hollow_rhombus_pattern(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.err.print(" ");
            }

            // hollow Rectangle
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();

        }
    }

    public static void diamond_pattern(int n) {

        // 1st half
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        // 2nd half
        for (int i = n - 1; i >= 1; i--) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Print Hollow Rectangle Pattern
        // hollow_rectangle(10, 6);

        // Inverted & Rotated Half-Pyramid
        // inverted_rotated_half_pyramid(5);

        // Inverted Half-Pyramid with Numbers
        // inverted_half_pyramid_numbers(5);

        // Floyd's Triangle
        // floyds_triangle(5);

        // 0-1 Triangle
        // zero_one_traingle(5);

        // BUTTERFLY Pattern
        // butterfly_pattern(5);

        // solid Rhombus Pattern
        // solid_rhombus_pattern(5);

        // Hollow Rhombus Pattern
        // hollow_rhombus_pattern(5);

        // Diamond Pattern
        // diamond_pattern(5);
    }
}