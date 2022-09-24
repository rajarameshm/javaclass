package com.org.array;

import java.util.Arrays;

public class MultiArrayTest {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        //0, 1, 2, 3, 4
        //multi dimentional array with size 2 X 2
        int[][] twoDimentionalArray = new int[2][2];
        //00, 01, 10, 11
        twoDimentionalArray[0][0] = 1;
        twoDimentionalArray[0][1] = 2;
        twoDimentionalArray[1][0] = 3;
        twoDimentionalArray[1][1] = 4;
        MultiArrayTest multiArrayTest = new MultiArrayTest();
        multiArrayTest.printMultiDimentionalArray(twoDimentionalArray, 2, 2);

        //create an array and initialize values to that array
        int[] intArray1 = {10, 20, 30, 40, 50};

        int[][] multiDimensionalArray2 = {{11, 22}, {33, 44}};
        multiArrayTest.printMultiDimentionalArray(multiDimensionalArray2, 2, 2);

        int[][] multiDimensionalArray3 = {{11, 22, 33}, {44, 55, 66}};
        multiArrayTest.printMultiDimentionalArray(multiDimensionalArray3, 2, 3);

        char[] charArray1 = {'d', 'e', 'p', 'a', 'r', 't', 'm', 'e', 'n', 't'};
        multiArrayTest.copyToNewArrayAndPrintUsingArrayCopy(charArray1);

        multiArrayTest.copyToNewArrayAndPrintUsingCopyOf();

        multiArrayTest.copyToNewArrayAndPrintUsingClone();

        multiArrayTest.copyToNewArrayAndPrintUsingCopyOfRange();
    }

    public void printMultiDimentionalArray(int[][] twoDimentionalArray, int size1, int size2) {

        for (int i=0; i<size1 ; i++) {
            System.out.print(" ");
            for (int j=0; j<size2; j++) {
                System.out.print(" " + twoDimentionalArray[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void copyToNewArrayAndPrintUsingArrayCopy(char[] charAarray) {

        char[] newCharArray = new char[8];

        System.arraycopy(charAarray, 2, newCharArray, 0, 8);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+charAarray[i]);
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print(" "+newCharArray[i]);
        }

        char[] newCharArray2 = new char[4];
        System.arraycopy(charAarray, 2, newCharArray2, 0, 4);
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(" "+newCharArray2[i]);
        }

    }

    public void copyToNewArrayAndPrintUsingCopyOf() {
        int[] intArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println();
        for (int i = 0; i < intArray1.length; i++) {
            System.out.print(" "+intArray1[i]);
        }
        System.out.println();
        int[] targetArray1 = Arrays.copyOf(intArray1, intArray1.length);
        for (int i = 0; i < targetArray1.length; i++) {
            System.out.print(" "+targetArray1[i]);
        }
        System.out.println();
    }

    public void copyToNewArrayAndPrintUsingClone() {
        char[] charSourceArray1 = {'w', 'e', 'l', 'c', 'o', 'm', 'e'};
        char[] charDestinationArray1 = charSourceArray1.clone();
        System.out.println("Source array...");
        for (int i = 0; i < charSourceArray1.length; i++) {
            System.out.print(" "+charSourceArray1[i]);
        }
        System.out.println();
        System.out.println("destination array...");
        for (int i = 0; i < charDestinationArray1.length; i++) {
            System.out.print(" "+charDestinationArray1[i]);
        }
    }

    public void copyToNewArrayAndPrintUsingCopyOfRange() {
        int[] sourceArray = {1, 2, 3, 4, 5, 6, 7};
        int[] targetArray = Arrays.copyOfRange(sourceArray, 2, 5);
        System.out.println();
        for (int i = 0; i < targetArray.length; i++) {
            System.out.print(" "+targetArray[i]);
        }
    }
}
