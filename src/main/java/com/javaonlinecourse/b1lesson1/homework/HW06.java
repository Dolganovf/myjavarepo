package com.javaonlinecourse.b1lesson1.homework;

/**
 * По заданной длине окружности L найти площадь круга S,
 * ограниченного этой окружностью.
 * Контрольный пример: L=6. Результат: S=2.866242.
 */
public class HW06 {
    public static void main(String[] args) {
        double l,s;
        l = 6;

        s = Math.pow(l,2) / (4*Math.PI);

        System.out.println("Площадь:" + s);
    }
}
