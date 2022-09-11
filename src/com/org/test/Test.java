package com.org.test;

import com.org.test.sub.Test2;

public class Test {
    public void print() {
        System.out.println("i am a public method from package : com.org.test");
    }
    protected void printProtected() {
        System.out.println("i am a protected method from package : com.org.test");
    }

    void printDefault() {
        System.out.println("i am a default method from package : com.org.test");
    }

    private void printPrivate() {
        System.out.println("i am a private method from package : com.org.test");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.print();
        test.printPrivate();
    }
}
