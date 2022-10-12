package PR5;

public class Y11 {

    public static int recursion11() {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        if (n == 1) {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return recursion11() + n + m;
            } else {
                int k = in.nextInt();
                // Базовый случай
                if (k == 1) {
                    // Шаг рекурсии / рекурсивное условие
                    return recursion11() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return recursion11() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static int recursion12() {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        if (n == 0) {
            return 0;
        }

        if (n % 2 != 0) {

            System.out.println(n);
        }

        return recursion12();
    }

    public static int recursion13() {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        if (n == 0) {
            return 0;
        }

        System.out.println(n);
        int a = in.nextInt();

        return recursion12();
    }

    public static void main(String[] args) {

        System.out.println(recursion11());
        //recursion12();
        //recursion13();
    }
}
