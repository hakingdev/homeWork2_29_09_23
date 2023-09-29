public class Main {
    public static void main(String[] args) {
        //Homework #1
        char charName ='g';
        int numberInt = 89;
        byte byteName = 4;
        short shortName = 54;
        float floatNumber = 4.7333436F;
        double doubleNumber = 4.355453532;
        long longNumber = 12121;
        System.out.println(charName);
        System.out.println(numberInt);
        System.out.println(byteName);
        System.out.println(shortName);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(longNumber);

        //Homework #2

        int number2 = 345;
        int n1 = number2 / 100;
        int n2 = number2 % 100/10;
        int n3 = number2 % 10;
        System.out.println("Число " + number2 + " -> " + n1 + ", " + n2 + ", " + n3);

        String numberPrint = numbers();
        System.out.println(numberPrint); // 1 way
        numbersSecondWay();
    }

    public static String numbers() {
        int number2 = 987;
        int n1 = number2 / 100;
        int n2 = number2 % 100/10;
        int n3 = number2 % 10;
        return "Число " + number2 + " -> " + n1 + ", " + n2 + ", " + n3;
    }

    public static void numbersSecondWay() {
        int number2 = 767;
        int n1 = number2 / 100;
        int n2 = number2 % 100/10;
        int n3 = number2 % 10;
        System.out.println("Число " + number2 + " -> " + n1 + ", " + n2 + ", " + n3);
    }
}