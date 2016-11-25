package com.javaonlinecourse.b1lesson1.homework;

/**
 * По заданным величинам радиусов оснований R и r и высоты h найти объем и площадь поверхности усеченного конуса.
 * Формулы найти в интернете.
 * Контрольный пример: R = 20, r = 10, h = 30. Результат: S=4548.866, V=21980.
 */
public class HW02 {
    public static void main(String[] args) {
        double r, R, h, S, V, l;
        R = 20;
        r = 10;
        h = 30;
        l = Math.pow(h * h + (R - r) * (R - r),0.5);
        V = (Math.PI * h * (Math.pow(R,2) + R * r + Math.pow(r,2)))/3;
        S = Math.PI*(Math.pow(r,2) + (R + r) * l + Math.pow(R,2));

        System.out.println("обьем " +V);
        System.out.println("Площадь  " +S);
    }
}
