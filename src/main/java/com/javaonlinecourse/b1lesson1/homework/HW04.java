package com.javaonlinecourse.b1lesson1.homework;

/**
 * Даны два положительных числа.
 * Найти среднее арифметическое и среднее геометрическое этих чисел.
 * Контрольный пример: А=4, B=9. Результат: среднее арифметическое = 6,5. Среднее геометрическое = 6.
 */
public class HW04 {
    public static void main(String[] args) {
        double a,b;
        a = 4;
        b = 9;

        System.out.println("Среднее арифметическое: " + (a + b)/2);
        System.out.println("Среднее геометрическое: " + Math.pow((a * b),0.5));
    }
}
