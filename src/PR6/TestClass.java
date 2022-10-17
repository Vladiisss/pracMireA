package PR6;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        String name; int id;
        Scanner in = new Scanner(System.in);

        System.out.print("Кол-во студентов: ");
        int N = in.nextInt();

        Student[] iDNumber = new Student[N];
        for (int i = 0; i < N; i++) {
            name = in.next();
            id = in.nextInt();
            Student obj = new Student(name , id);
            iDNumber[i] = obj;
        }


        Arrays.sort(iDNumber);

        System.out.println(Arrays.toString(iDNumber));

    }
}
