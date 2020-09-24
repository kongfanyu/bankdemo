package com.bank;

/**
 * Copyright (C), 2018-2020
 * FileName: Demo1
 * Author:   kongfanyu
 * Date:     2020/9/24 15:09
 */
public class Demo1 {
    public static void main(String[] args) {
        // test2();
        System.out.println(Math.sqrt(9));
    }

    private static void test2() {
        int sum = 0;
        for (int m = 2; m <= 200000; m++) {
            boolean x = true;
            //16 2,3,4
            for (int n = 2; n <= Math.sqrt(m); n++) {
                if (m % n == 0) { //16%2=1
                    x = false;
                    continue;
                }
            }
            if (x) {
                sum += m;
            }
        }
        System.out.print(sum);
    }

    private static void test1() {
        int sum = 0;
        for (int m = 2; m <= 200000; m++) {
            int x = 0;
            for (int n = 2; n < m; n++) {
                if (m % n == 0) {
                    x++;
                }
            }
            if (x == 0) {
                sum += m;
            }
        }
        System.out.print(sum);
    }
}
