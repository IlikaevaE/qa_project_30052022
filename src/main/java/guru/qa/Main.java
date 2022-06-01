package guru.qa;

public class Main {
    public static void main(String[] args) {
        checkInt();
        checkBoolean();
        checkChar();
        checkByte();
        checkShort();
        checkLong();
        checkDouble();
        checkFloat();
        checkIntLong();
    }

    public static void checkInt() {
        int a = 151_256_895;
        int b = 5555;
        int g = -5555;
        int k = a * g;
        int c = a + b;
        int d = a * b;
        int e = a / b;
        int f = a - b;
        System.out.println("Сумма чисел равна: " + c);
        System.out.println("max value overflow: " + d);
        System.out.println("min value overflow: " + k);
        System.out.println("Частность чисел равна: " + e);
        System.out.println("Разность чисел равна: " + f);
    }

    public static void checkBoolean() {
        boolean bool = Character.isDigit('5');
        System.out.println(bool);
    }

    public static void checkChar() {
        char chr1 = 35555;
        char chr2 = 30000;
        char chr3 = 36000;
        int overSum = (char) (chr1 + chr2);
        int result = chr1 - chr3;
        System.out.println("max value overflow char: " + overSum);
        System.out.println("min value overflow char: " + result);
    }
    // от - 128 до 127
    public static void checkByte() {
        byte bt1 = 45;
        byte bt2 = 3;
        byte bt3 = -3;
        byte result1 = (byte) (bt1 * bt2);
        byte result2 = (byte) (bt1 * bt3);
        System.out.println("max value overflow byte: " + result1);
        System.out.println("min value overflow byte: " + result2);
    }
    // от -32 768 до 32 767
    public static void checkShort(){
        short sh1 = 156;
        short sh2 = 668;
        short sh3 = -700;
        short result = (short) (sh1 * sh2);
        short result1 = (short) (sh1 * sh3);
        System.out.println("max value overflow short: " + result);
        System.out.println("min value overflow short: " + result1);
    }
    public static void checkLong() {
        long lg1 = 999989989;
        long lg2 = 999999599;
        long result = lg1 * lg2;
        System.out.println("Result of Long: " + result);

    }
    public static void checkDouble() {
        double db = 0.5;
        double db2 = 1.5;
        double result = db * db2;
        System.out.println("Result of Double: " + result);
    }
    public static void checkFloat(){
        float fl1 = 305.9f;
        float fl2 = 408.7f;
        float result = fl1 + fl2;
        System.out.println("Result of Float: " + result);
    }
    public static void checkIntLong() {
        int a = 56;
        long b = 8;
        int result = a /(int) b;
        System.out.println("Result of IntLong: " + result);
    }
}
