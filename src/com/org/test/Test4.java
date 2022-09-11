package com.org.test;

public class Test4 extends Test {

    public void test4() {
        super.printDefault();
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.printDefault();
        Test4 test4 = new Test4();
        test4.test4();
    }
}
