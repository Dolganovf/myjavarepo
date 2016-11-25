package com.javaonlinecourse.b1lesson1.homework;

/**
 * Треугольник задан длинами сторон a, b, c. Найти длины медиан.
 * Длина медианы, проведенной на сторону a.
 * Контрольный пример: a=3, b=4, c=5. Результат: ma=4.27
 */
public class HW07 {
    public static void main(String[] args) {
        double a,b,c, ma;
        a = 3;
        b = 4;
        c = 5;
        ma = 0.5 * (Math.pow((2 * Math.pow(b,2) + 2 * Math.pow(c,2) - Math.pow(a,2)),0.5));

        System.out.println("Длины медиан " + ma);

    }
}
