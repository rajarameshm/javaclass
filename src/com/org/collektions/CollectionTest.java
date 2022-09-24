package com.org.collektions;

import java.util.*;

public class CollectionTest {

    public void testArrayList() {
        System.out.println("testing arrayList .....");
        List<String> listOfStrings = new ArrayList<>();

        //list allows to add duplicate elements
        listOfStrings.add("element 1");
        listOfStrings.add("element 2");
        listOfStrings.add("element 2");
        System.out.println(listOfStrings);

        //list allows multiple null elements
        listOfStrings.add(null);
        listOfStrings.add(null);
        System.out.println(listOfStrings);

        //insertion order is preserved

        for (int i=0; i<listOfStrings.size(); i++) {
            System.out.println(listOfStrings.get(i));
        }

        //using iterator
        Iterator iterator = listOfStrings.iterator();
        while (iterator.hasNext()) {//returns true if there is a next element
            System.out.println(iterator.next());//returns the next element
        }

    }

    public void testLinkedList() {
        System.out.println("testing linked list.....");
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Goa");
        System.out.println(fruits);

        fruits.add("Banana");
        System.out.println(fruits);

        fruits.addFirst("Watermelon");
        System.out.println(fruits);

        fruits.addLast("Grapes");
        System.out.println(fruits);

        fruits.add(2, "Mango");
        System.out.println(fruits);

        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Fruit 1");
        moreFruits.add("Fruit 2");

        fruits.addAll(moreFruits);
        System.out.println(fruits);
    }

    public void testSet() {
        Set<String> setOfStrings = new HashSet<>();
        setOfStrings.add("element 1");
        setOfStrings.add("element 2");
        setOfStrings.add("element 3");
        System.out.println(setOfStrings);

        //ignore duplicates
        setOfStrings.add("element 3");
        System.out.println(setOfStrings);

        //one null element allowed
        setOfStrings.add(null);
        setOfStrings.add(null);
        System.out.println(setOfStrings);

    }

    public void testLinkedHasSet() {
        LinkedHashSet<String> weeks = new LinkedHashSet<>();
        weeks.add("Sun");
        weeks.add("Mon");
        weeks.add("Tue");
        weeks.add("Wed");
        weeks.add("Thu");
        weeks.add("Fri");
        weeks.add("Sat");

        System.out.println(weeks);

        //ignore duplicates
        weeks.add("Sat");
        System.out.println(weeks);

    }

    public void testTreeSet() {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Goa");

        System.out.println(fruits);
        //ignore duplicates
        fruits.add("Banana");
        System.out.println(fruits);


    }

    public static void main(String[] args) {
        Collection<String> colorCollection = new ArrayList<>();
        colorCollection.add("Red");
        colorCollection.add("Green");
        colorCollection.add("Blue");
        System.out.println(colorCollection);

        colorCollection.remove("Green");
        System.out.println(colorCollection);

        colorCollection.clear();
        System.out.println(colorCollection);

        CollectionTest collectionTest = new CollectionTest();

        collectionTest.testSet();
        collectionTest.testLinkedHasSet();
        collectionTest.testTreeSet();

        collectionTest.testArrayList();
        collectionTest.testLinkedList();
        collectionTest.compareArray();

    }

    public void compareArray() {

        int[] intArray1 = {1, 2, 3, 4, 5};
        int[] intArray2 = {1, 2, 3, 4, 5};


        if (intArray1 == intArray2) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        //correct way to compare two arrays
        if (Arrays.equals(intArray1, intArray2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
