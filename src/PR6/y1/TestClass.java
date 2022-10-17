package PR6.y1;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

    public static void insertionSort(Student[] arr) {

        for (int left = 0; left < arr.length; left++) {

            Student value = arr[left];

            int i;
            for (i = left - 1; i >= 0; i--) {

                if (value.compareTo(arr[i]) < 0) {
                    arr[i + 1] = arr[i];
                }
                else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Кол-во студентов: ");
        int N = in.nextInt();

        Student[] iDNumber = new Student[N];
        for (int i = 0; i < N; i++) {

            Student obj = new Student(in.next(), in.nextInt());
            iDNumber[i] = obj;
        }


        insertionSort(iDNumber);

        System.out.println(Arrays.toString(iDNumber));

    }
}
