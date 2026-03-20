import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Задача 1: проверка високосного года
        int year = 2024;
        checkLeapYear(year);

        // Задача 2: рекомендация версии приложения
        int osType = 0; // 0 - iOS, 1 - Android
        int deviceYear = 2014;
        recommendAppVersion(osType, deviceYear);

        // Задача 3: расчёт дней доставки
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + days);
    }

    // Метод для проверки високосного года
    public static void checkLeapYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Метод для рекомендации версии приложения
    public static void recommendAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear(); // или задать вручную: 2026
        boolean isOldDevice = deviceYear < currentYear;

        String osName;
        switch (osType) {
            case 0:
                osName = "iOS";
                break;
            case 1:
                osName = "Android";
                break;
            default:
                osName = "неизвестная ОС";
                break;
        }

        if (isOldDevice) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для " + osName);
        }
    }

    // Метод для расчёта дней доставки
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            System.out.println("Доставка недоступна");
            return -1; // возвращаем -1 как признак невозможности доставки
        }
    }
}