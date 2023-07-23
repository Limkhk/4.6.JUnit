package ru.netology;

import java.util.Scanner;

public class CircleArea {
    public static final double pi = 3.14;
    // метод расчёт площади окружности
    public static double areaCircle(double a, int b) {
        double result = a * (b * b);
        return result;
    }
    // метод расчёт длины окружности
    public static double lengthCircle(int a, double b, int c) {
        double result = a * b * c;
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи радиус окружности: ");
        int r = scanner.nextInt();
        String m = scanner.nextLine();
        double s = areaCircle(pi, r);
        double l = lengthCircle(2, pi, r);
        System.out.println("Площадь окружности = " + s + " см.кв.");
        System.out.println("Длина окружности = " + l + "см.кв.");
    }
}