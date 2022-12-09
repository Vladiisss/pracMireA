package PR9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MakingOrder {

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void checkINN(String inn) throws BadINNException {

        if (inn.length() != 10) {
            throw new BadINNException("Неверное кол-во символов");
        }
        if (!isNumeric(inn)) {
            throw new BadINNException("INN содержит буквы");
        }
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = in.nextLine();
        System.out.println("Введите INN:");
        String inn = in.nextLine();

        try {
            checkINN(inn);
            Client client = new Client(name, inn);
            System.out.println("Все хорошо");
        } catch (BadINNException e) {
            System.out.println(e);
        }



    }
}
