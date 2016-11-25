package com.javaonlinecourse.b1lesson1.homework;

/**
 * Даны катеты прямоугольного треугольника.
 * Найти его гипотенузу и площадь.
 * Контрольный пример: A=4, B=3. Результат: гипотенуза = 5, площадь = 6.
 */
public class HW05 {
    public static void main(String[] args) {
       double a,b;
        a = 4;
        b = 3;

        System.out.println("Гипотенуза: " + Math.pow((a * a + b * b),0.5));
        System.out.println("Площадь: " + ((a * b)/2));
    }
}
