package com.geekbrains;
// Задание первое
public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println();
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    // Задание второе
    public static void printThreeWords(){
        System.out.println(" Orange \n Banana\n Apple");
    }
    // Задание третье
    public static void checkSumSign() {
        int a, b, c;
        a = 3;
        b = 2;
        //c = a+b;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание четвертое


    public static void printColor() {
        int value = 2;
        if (value<=0){
            System.out.println("Красный");
        }
        else if (value<=100){
            System.out.println("Желтый");
        }
        else if (value>100){
            System.out.println("Зеленый");

        }
    }
    // Задание пятое
    public static void compareNumbers() {
        int a,b;
        a = 2;
        b = 3;
        if (a>=b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }


    }

    }
