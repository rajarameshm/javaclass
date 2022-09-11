package com.org.test2;

import com.org.test.Test;
import java.util.Map;

public class Test3 extends Test {
    public void test3() {
        super.printProtected();
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.print();
    }
}
