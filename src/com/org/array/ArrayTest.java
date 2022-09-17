package com.org.array;

import com.org.immutable.Employee;
import com.org.immutable.Name;

public class ArrayTest {

    public static void main(String[] args) throws Exception {
        //declare array and initialized by allocating 5
        int[] intArray = new int[5];

        //initialize the values
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);

        for (int i=0; i<5; i++) {
            System.out.println("the value at index " + i + " is " + intArray[i]);
        }

        boolean[] booleanArray = new boolean[2];
        booleanArray[0] = true;
        booleanArray[1] = false;

        for (int i=0; i<2; i++) {
            System.out.println("the value at index " + i + " is " + booleanArray[i]);
        }

        String[] stringArray = new String[5];
        stringArray[0] = "ABC";
        stringArray[1] = "XYZ";
        stringArray[2] = "city";
        stringArray[3] = "state";
        stringArray[4] = "zip";

        System.out.println("the value at index 2 is " + stringArray[2]);

        Employee[] employees = new Employee[2];

        Name name1 = new Name("James", "Bond", "007");
        Employee employee1 = new Employee("001", 10000, name1);

        employees[0] = employee1;

        Name name2 = new Name("James", "Cameron", "X");
        Employee employee2 = new Employee("002", 20000, name2);
        employees[1] = employee2;

        for (int i=0; i<2; i++) {
            System.out.println("Employee id: " + employees[i].getId() + " salary: "+ employees[i].getSalary());
        }

        //create an array and initialize values to that array
        int[] intArray1 = {10, 20, 30, 40, 50};

        for (int i=0; i<5; i++) {
            System.out.println("the value at index " + i + " is " + intArray1[i]);
        }

        String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        for (int i=0; i<7; i++) {
            System.out.println("Week " + (i+1) + " is " + weeks[i]);
        }

    }
}
