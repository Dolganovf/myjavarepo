package com.javaonlinecourse.b1lesson1.homework;

/**
 * Вычислить объем пирамиды, основанием которой является треугольник, для значений А, В, С и Н данных в контрольном
 * примере.  Для вычисления площади основания использовать формулу Герона (найти в интернете).
 * Контрольный пример:  A=3, B=4, C=5, H=6. Результат V=12.
 */
public class HW01 {
    public static void main(String[] args) {
        int a,b,c,h;
        double p,s,v,i,r;
        a=3;
        b=4;
        c=5;
        h=6;
        i=1;
        r=3;
        p = ((a+b+c)/2);
        s = Math.sqrt(p*(p - a) * (p - b) * (p - c));
        v =  Math.round (i/r  * (s * h));
        System.out.println(v);

    }
}

