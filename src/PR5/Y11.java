package PR5;

public class Y11 {

    public static int recursion11() {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        if (n == 1) {
            return recursion11() + 1;
        }

        if (n != 0) {
            return recursion11();
        }

        int a = in.nextInt();
        if (a == 0) {
            return 0;
        }

        if (a == 1) {
            return recursion11() + 1;
        }

        return recursion11();
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
