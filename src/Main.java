import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        searchForLeapYear(2021);

        System.out.println("Задание 2");
        choosingApplicationVersion(LocalDate.now().getYear(), 0);

        System.out.println("Задание 3");
        calculationBankCardDeliveryDays(95);

    }

    // Задание 1

    public static void searchForLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
            return;
        }
        System.out.println(year + " не является високосным");
    }

    // Задание 2

    public static void choosingApplicationVersion(int clientDeviceYear, int clientOS) {
        if (clientDeviceYear >= 2015) {
            if (clientOS == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    // Задание 3

    public static void calculationBankCardDeliveryDays(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (day + 2));
        }
    }
}