package com.org.wrap;

public class WrapperTest {
    public WrapperTest() {

    }

    public static void autoboxing(Integer i) {
        System.out.println("Integer passed, value is : " + i);
    }

    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        Integer m = new Integer(10);
        System.out.println(m + 20);
        Integer n = new Integer("10");
        System.out.println(n + 30);

        Integer o = Integer.valueOf(50);
        System.out.println(o);
        Integer p = Integer.valueOf("60");
        System.out.println(p);

        Float q = Float.valueOf("1");
        System.out.println(q);

        Boolean flag = Boolean.valueOf("true");
        System.out.println(flag);

        autoboxing(i);

        Integer k = Integer.valueOf(100);
        Integer l = k;

        if (k == l) {
            System.out.println("both referring to same");
        } else {
            System.out.println("both are NOT referring to same");
        }

        k++;

        if (k == l) {
            System.out.println("both referring to same");
        } else {
            System.out.println("both are NOT referring to same");
        }

        byte byteB = 77;
        System.out.println("value of byteB : " + byteB);
        char charC = 'C';
        System.out.println("value of charC : " + charC);
        float floatF = 1.1f;
        System.out.println("value of flatF : " + floatF);
        double doubleD = 2.34d;
        System.out.println("value of doubeD : " + doubleD);

    }
}
