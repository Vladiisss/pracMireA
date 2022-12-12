package PR12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertPhoneNumber {

    public static String convertPhoneNumber(String number) throws BadPhoneNumberException {

        Pattern pattern = Pattern.compile("((\\+\\d{1,4})|\\d{1,4})\\d{10}");
        Matcher m1 = pattern.matcher(number);

        if (!m1.matches()) throw new BadPhoneNumberException("Некорректный номер телефона");

        number = number.substring(number.indexOf('+') + 1);

        int len = number.length();

        String code = number.substring(0, len - 10);
        String threeDigits1 = number.substring(len - 10, len - 7);
        String threeDigits2 = number.substring(len - 7, len - 4);
        String fourDigits = number.substring(len - 4, len);

        return '+' + code + '-' + threeDigits1 + '-' + threeDigits2 + '-' + fourDigits;
    }


    public static void main(String[] args) {

        try {
            System.out.println(
                    ConvertPhoneNumber.convertPhoneNumber("+71234567891") + '\n' +
                            ConvertPhoneNumber.convertPhoneNumber("81234567891") + '\n' +
                            ConvertPhoneNumber.convertPhoneNumber("+99991234567891") + '\n' +
                            ConvertPhoneNumber.convertPhoneNumber("99991234567891")
            );
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
