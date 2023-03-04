public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear=2014;
        if (clientDeviceYear<2015){
        switch (clientOS) {
            case 0:
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("установите облегченную версию приложения для Android по ссылке");
        }
        }else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year%400==0) {
            System.out.println("год " + year + " является високосным");
        }else{
            System.out.println("год "+ year + " не является високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 99;
        if(deliveryDistance<=20){
            System.out.println("Потребуется дней: 1");
            }
        if (deliveryDistance>20 && deliveryDistance<60){
            System.out.println("потребуется дней:2");
        }
        if (deliveryDistance>60 && deliveryDistance<100){
                System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("доставка не осуществляется");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber=13;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("это осень ");
                break;
            default:
                System.out.println("такого месяца не существует");
        }
        }
}