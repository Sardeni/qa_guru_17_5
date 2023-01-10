package com.sardeni;

public class PrimitivesAndCalculations {

    public static void overOfMemory() {

        byte varByte = 120 + 10;
        System.out.println(varByte);


        short varShort = 32000 + 1000;
        System.out.println(varShort);

        int varInt = 2000000000 + 2000000000;
        System.out.println(varInt);

    }

    public static void checkMathOperators() {

        int a = 2 + 5;
        System.out.println(a);

        int b = 2 - 8;
        System.out.println(b);

        int c = a * b;
        System.out.println(c);

        int d = c / a;
        System.out.println(d);

        int e = d % 2;
        System.out.println(e);

        System.out.println(e++);
        System.out.println(++e);

        System.out.println(--c);
        System.out.println(c--);

    }

    public static void compareOperators() {
        int f = 3;
        int g = 5;
        int h = 3;
        System.out.println(f > g);
        System.out.println(f < g);
        System.out.println(f >= h);
        System.out.println(f <= h);
        System.out.println(f != g);
        System.out.println(f == h);
    }

    public static void calculatingDifferenceTypes() {

        int varInt = 23;
        double varDouble = 5.24;
        System.out.println(varInt + varDouble);
    }
}
