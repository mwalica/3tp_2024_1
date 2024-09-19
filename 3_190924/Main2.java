public class Main2 {
    public static void main(String[] args) {
        //konwersja niejawna -> mniejszy do większego
        int intNumber = 23;//4B
        long longFromInt = intNumber;//8B
        short shortNumber = 3022;//2B
        int intFromShort = shortNumber;//4B
        float floatFromInt = intNumber;//4B
        //konwersja jawna - rzutowanie -> większy do mniejszego
        long longNumber = 12345;//8B
        int intFromLong = (int) longNumber;//4B
        System.out.println(longNumber);
        System.out.println(intFromLong);
        int number100 = 129;//
        byte byteFromInt = (byte) number100;
        System.out.println(number100);
        System.out.println(byteFromInt);
        double number101 = 23.99;
        int number102 = (int) number101;
        System.out.println(number101);
        System.out.println(number102);

        String number103 = "123";
        //parowanie na liczbę
        int number104 = Integer.parseInt(number103);
        int number105 = 245;
        //zamiana na ciąg znaków
        String strFromNumber = String.valueOf(245);
        System.out.println(number104);
    }
}
