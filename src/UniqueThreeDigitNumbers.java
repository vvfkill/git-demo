public class UniqueThreeDigitNumbers {
    public static void main(String[] args) {
        System.out.println("Трехзначные числа с уникальными цифрами:");

        for (int i = 100; i < 1000; i++) {
            int hundreds = i / 100; // Сотни
            int tens = (i / 10) % 10; // Десятки
            int units = i % 10; // Единицы

            // Проверяем, что все цифры разные
            if (hundreds != tens && hundreds != units && tens != units) {
                System.out.println(i);
            }
        }
    }
}
