package com.company;

public class Main {

    public static void main(String[] args) {
	//Задание 1
        int clientOs = 1;
                if (clientOs == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else{
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    //Задание 2
        int clientOs1 = 0;
                int clientDeviceYear = 2014;
                if (clientOs1 == 0 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }else if (clientOs1 == 0 && clientDeviceYear >= 2015){
                        System.out.println("Установите приложение для Android по сыллке");
                    }
                    if (clientOs1 == 1 && clientDeviceYear < 2015) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    }else if (clientOs1 == 1 && clientDeviceYear >= 2015){
                        System.out.println("Установите приложение для iOS по сыллке");
                    }
    //Задание 3
        int year = 2021;
                    if ((year % 400) == 0 || ((year % 100) != 0 && (year % 4) == 0) ) {
                        System.out.println(year + " год является висококосным.");
                    }else{
                        System.out.println(year + " год не является висококосным.");

                    }

    //Задание 4
        int deliveryDistance = 20;
        int deliveryDays = 1;
                    if (deliveryDistance <= 20){
                        System.out.println("Потребуется" + deliveryDays + " дней.");
                    }else if (deliveryDistance > 20 && deliveryDistance < 60){
                        System.out.println("Потребуется" + deliveryDays + 1 + " дней.");
                    }else if (deliveryDistance >=60 && deliveryDistance < 100){
                        System.out.println("Потребуется" + deliveryDays + 2 + "дней");
                    }else{
                        System.out.println("Доставка в удаленные районы не совершается");
                    }
    //Задание 5
        int monthNumber = 12;
                    switch (monthNumber) {
                        case 1:
                        case 2:
                        case 12:
                            System.out.println("Сейчас зима");
                            break;
                        case 3:
                        case 4:
                        case 5:
                            System.out.println("Сейчас весна");
                            break;
                        case 6:
                        case 7:
                        case 8:
                            System.out.println("Сейчас лето");
                            break;
                        case 9:
                        case 10:
                        case 11:
                            System.out.println("Сейчас осень");
                            break;
                        default:
                            System.out.println("Такого месяца не существует");
                    }
                }


    }

