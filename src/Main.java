public class Main {
    public static void main(String[] args) {
        //задание1
        byte clientOS = 0;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        //задание 2
        int clientDeviceYear = 2015;
        if (clientOS == 0){
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else{
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else if (clientOS == 1){
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        //задание3
        int year = 2004;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " год является високосным");
        }
        else{
            System.out.println(year + " год не является високосным");
        }
        //задание4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + 1);
        }
        if (deliveryDistance > 20 && deliveryDistance <=60){
            System.out.println("Потребуется дней: " + 2);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + 3);
        }
        else{
            System.out.println("Доставка невозможна");
        }
        //задание5
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("зима");
                break;
            case 3:
                System.out.println("весна");
                break;
            case 4:
                System.out.println("весна");
                break;
            case 5:
                System.out.println("весна");
                break;
            case 6:
                System.out.println("лето");
                break;
            case 7:
                System.out.println("лето");
                break;
            case 8:
                System.out.println("лето");
                break;
            case 9:
                System.out.println("осень");
                break;
            case 10:
                System.out.println("осень");
                break;
            case 11:
                System.out.println("осень");
                break;
            case 12:
                System.out.println("зима");
                break;
            default:
                break;
        }
    }
}