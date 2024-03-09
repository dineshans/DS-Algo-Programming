package com.binarysearch.monotonic.funtion;

public class FindSquareRootofNumber {

    public static void main(String[] args) {

        findSqrt();
    }

    public static void findSqrt() {

        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeVal = -5;
        double nan = Double.NaN;
        double result;

        // Here argument is negative,
        // output will be NaN
        result = Math.sqrt(negativeVal);
        System.out.println(result);

        // Here argument is positive infinity,
        // output will also positive infinity
        result = Math.sqrt(positiveInfinity);
        System.out.println(result);

        // Here argument is NaN, output will be NaN
        result = Math.sqrt(nan);
        System.out.println(result);

        int n = 30;
        System.out.println(Math.sqrt(n));

        int x = 36;
        System.out.println(Math.sqrt(x));

    }
}
