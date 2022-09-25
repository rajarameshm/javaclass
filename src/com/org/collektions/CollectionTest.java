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
        collectionTest.testVector();
        collectionTest.testMap();
        collectionTest.testLinkedHashMap();
        collectionTest.testTreeMap();

        collectionTest.testQueue();

    }

    public void testQueue() {

        System.out.println("testing queue.....");
        Queue<String> queue = new LinkedList<>();
        System.out.println("is queue empty 1 : " + queue.isEmpty());
        System.out.println("size of the queue 1 : " + queue.size());
        queue.add("element 1");
        System.out.println("element is : "+queue.element());
        System.out.println("peek is : "+queue.peek());
        queue.add("element 2");
        System.out.println("element is : "+queue.element());
        System.out.println("peek is : "+queue.peek());
        queue.add("element 3");
        System.out.println("element is : "+queue.element());
        System.out.println("peek is : "+queue.peek());

        System.out.println(queue);
        System.out.println("is queue empty 2 : " + queue.isEmpty());
        System.out.println("size of the queue 2 : " + queue.size());
        if (queue.contains("element 2")) {
            System.out.println("queue contains 'element 2'");
        } else {
            System.out.println("queue does not contain 'element 2'");
        }

        System.out.println("removing an element");
        String element = queue.remove();
        System.out.println("removed element 1 : "+element);
        System.out.println(queue);
        element = queue.remove();
        System.out.println("removed element 2 : "+element);
        System.out.println(queue);
        element = queue.remove();
        System.out.println("removed element 3: "+element);
        System.out.println(queue);

        try {
            element = queue.remove();
            System.out.println("removed element 4: "+element);
            System.out.println(queue);
        } catch (Exception e) {
            System.out.println("Exception thrown as expected because of No Such Element");
        }

        queue = new LinkedList<>();
        queue.add("element 1");
        queue.add("element 2");
        queue.add("element 3");
        System.out.println(queue);

        element = queue.poll();
        System.out.println("poll element 1: "+element);
        System.out.println(queue);
        element = queue.poll();
        System.out.println("poll element 2: "+element);
        System.out.println(queue);
        element = queue.poll();
        System.out.println("poll element 3: "+element);
        System.out.println(queue);
        element = queue.poll();
        System.out.println("poll element: "+element);
        System.out.println(queue);



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

    public void testVector() {

        System.out.println("testing vector.....");

        Vector vector = new Vector();
        vector.add("vector element 1");
        vector.add("vector element 2");
        vector.add("vector element 3");

        System.out.println(vector);
    }

    public void testMap() {

        System.out.println("testing map.....");
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        System.out.println(map);

        map.put("key4", "value4");
        System.out.println(map);

        map.put("key5", "value4");
        System.out.println(map);

        map.put("key5", "value5");
        System.out.println(map);

        System.out.println("value for key4 is : " + map.get("key4"));

        Set<String> keys = map.keySet();
        Iterator keyIterator = keys.iterator();
        while(keyIterator.hasNext()) {
            String key = (String)keyIterator.next();
            System.out.println("key : " + key + " value : " + map.get(key));
        }
    }

    public void testLinkedHashMap() {

        System.out.println("testing linkedHashMap.....");
        LinkedHashMap<String, Integer> weekOrderMap = new LinkedHashMap<>();
        weekOrderMap.put("Mon", 1);
        weekOrderMap.put("Tue", 2);
        weekOrderMap.put("Wed", 3);
        System.out.println(weekOrderMap);

        weekOrderMap.put("Thu", 4);
        System.out.println(weekOrderMap);

        weekOrderMap.putIfAbsent("Fri", 5);
        System.out.println(weekOrderMap);

        weekOrderMap.putIfAbsent("Fri", 6);
        System.out.println(weekOrderMap);
    }

    public void testTreeMap() {

        System.out.println("testing treeMap.....");
        TreeMap<String, String> stateStateCode = new TreeMap<>();
        stateStateCode.put("Telangana", "TS");
        stateStateCode.put("Andhra", "AP");
        stateStateCode.put("Maharashtra", "MH");
        System.out.println(stateStateCode);

    }
}
