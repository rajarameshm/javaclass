package com.org.string;

public class StringTest {
    public static void main(String[] args) {
        String x1 = "java class"; //String pool
        String x2 = "java class"; //will not create a new instance; instead it will refer in string pool
        System.out.println("both the literals are == : " + (x1 == x2));
        System.out.println("both the literals are equal : " + (x1.equals(x2)));

        String x3 = new String("java class"); //heap memory
        System.out.println("literal and String == : " + (x1 == x3));
        System.out.println("literal and String are equal : " + (x1.equals(x3)));

        char[] c1 = {'j', 'a', 'v', 'a', ' ','c', 'l', 'a', 's', 's'};
        String x4 = new String(c1);
        System.out.println("char array to String : " + x4);
        System.out.println("literal and String == : " + (x1 == x4));
        System.out.println("literal and String are equal : " + (x1.equals(x4)));

        System.out.println("char array to String with offset and count : "+new String(c1, 5, 5));

        byte[] ascii = {65, 66, 67, 68, 69};
        System.out.println("byte array to String : "+new String(ascii));
        System.out.println("byte to char : ");
        for (int i = 65; i < 91; i++) {
            System.out.print(" "+ (char)i );
        }
        System.out.println();

        StringTest stringTest = new StringTest();
        stringTest.testStringBuilder();
        stringTest.testStringBuffer();
        stringTest.testStringBufferPerformance();
        stringTest.testStringBuilderPerformance();

        char c3 = x1.charAt(1);
        System.out.println("char at index 1 : " + c3);

        for (int i = 0; i < x1.length(); i++) {
            System.out.println("char at index " + i + " is : " + x1.charAt(i));
        }

        for (int i = 0; i < x1.length(); i++) {
            System.out.println("codePointAt index " + i + " is : " + x1.codePointAt(i));
        }

        stringTest.testConcat();
        String x5 = String.valueOf(100); // new String("100") or "100"
        System.out.println("string value of integer : " + x5);
        x5 = String.valueOf(2.0);
        System.out.println("string value of float : " + x5);
        x5 = String.valueOf(true);
        System.out.println("string value of float : " + x5);

        stringTest.testCompare();
        stringTest.testSortArrayOfString();





    }

    private void testSortArrayOfString() {
        String[] stringArray = {"java", "is", "powerful", "object", "oriented", "platform", "independent", "and",  "robust", "language"};
        System.out.println();
        for (String str: stringArray) {
            System.out.print(" "+str);
        }
        System.out.println();

        String[] sortedStringArray = new String[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = (i+1); j < stringArray.length; j++) {
                //0 if equals
                //-'ve if less than
                //+'ve if greater than
                if (stringArray[j].compareTo(stringArray[i]) < 0) {
                    String temp = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                }
            }
            sortedStringArray[i] = stringArray[i];
        }

        System.out.println();
        for (String str: sortedStringArray) {
            System.out.print(" "+str);
        }
        System.out.println();

    }

    private void testCompare() {
        String s1 = "Hello World";
        String s2 = "hello world";
        int compare = s1.compareTo(s2);
        System.out.println("compare s1 with s2 : "+compare);
        compare = s2.compareTo(s1);
        System.out.println("compare s1 with s2 : "+compare);
        String s3 = "java";
        String s4 = "java";
        compare = s3.compareTo(s4);
        System.out.println("compare s1 with s2 : "+compare);

        System.out.println("compare a with A : "+"a".compareTo("A"));
        System.out.println("compare A with a : "+"A".compareTo("a"));

    }

    private void testConcat() {
        String str = "some string";
        str = str.concat(" appended");
        System.out.println("concatenating string using method concat : " + str);
    }

    private void testStringBuilderPerformance() {
        long startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("string builder");
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(" appended").append(" appended again");
        }
        System.out.println("time taken for the StringBuilder is : " + (System.currentTimeMillis()-startTime) +"ms") ;
    }

    private void testStringBufferPerformance() {
        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("string buffer");
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append(" appended").append(" appended again");
        }
        System.out.println("time taken for the StringBuffer is : " + (System.currentTimeMillis()-startTime) +"ms") ;
    }

    private void testStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer("string buffer");
        stringBuffer.append(" appended").append(" appended again");
        System.out.println("StringBuffer to String : " + new String(stringBuffer));
    }

    private void testStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder("string builder");
        stringBuilder.append(" appended").append(" appended again");
        System.out.println("StringBuilder to String : " + new String(stringBuilder));
    }


}
