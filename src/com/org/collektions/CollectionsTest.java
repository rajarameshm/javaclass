package com.org.collektions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

    public CollectionsTest() {

    }

    public void testSort() {

        List<Project> projects = new ArrayList<>();
        Project project1 = new Project(3000, "Google");
        Project project2 = new Project(1000, "Yahoo");
        Project project3 = new Project(2000, "Facebook");
        projects.add(project1);
        projects.add(project2);
        projects.add(project3);
        System.out.println("projects before sorting...");
        for (int i=0; i< 3; i++) {
            System.out.println(projects.get(i).getProjectId());
        }

        //sorting projects by  project id ascending order
        Collections.sort(projects, Comparator.comparing(Project::getProjectId));
        System.out.println("projects after sorting...");
        for (int i=0; i< 3; i++) {
            System.out.println(projects.get(i).getProjectId());
        }

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("name 2");
        list.add("name 1");
        list.add("name 4");
        list.add("name 3");

        System.out.println("list before sorting");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int index = Collections.binarySearch(list, "name 1");
        System.out.println("name 1 found at index : " + index);

        Collections.sort(list);

        System.out.println("list after sorting");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int index2 = Collections.binarySearch(list, "name 3");
        System.out.println("name 3 found at index : " + index2);

        Collections.reverse(list);

        System.out.println("list after reverse");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.shuffle(list);

        System.out.println("list after shuffle");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.sort(list);

        System.out.println("list after sort");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.swap(list, 0, 3);
/*
0   1   4
1   2
2   3
3   4    1
*/

        System.out.println("list after swap");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.sort(list);

        System.out.println("list after sort");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.rotate(list, 1);

        System.out.println("list after rotate");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
/*
0   1   4
1   2   1
2   3   2
3   4   3
*/
        List<String> list2 = new ArrayList<>();
        list2.add("name 2");
        list2.add("name 1");
        list2.add("name 3");
        list2.add("name 3");

        int index3 = Collections.frequency(list2, "name 3");
        System.out.println("frequency of name 3 in the given list is : " + index3);

        List<Integer> marks = new ArrayList<>();
        marks.add(99);
        marks.add(97);
        marks.add(89);
        marks.add(95);

        int index4 = Collections.min(marks);
        System.out.println("min number of marks in the given list is : " + index4);

        int index5 = Collections.max(marks);
        System.out.println("max number of marks in the given list is : " + index5);

        CollectionsTest collectionsTest = new CollectionsTest();
        collectionsTest.testSort();

        collectionsTest.testComparable();
        collectionsTest.testComparator();

    }

    public void testComparable() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("book1", "author1", 4.5, 2020));
        books.add(new Book("book2", "author2", 3.5, 2020));
        books.add(new Book("book3", "author3", 4.0, 2021));
        books.add(new Book("book4", "author2", 4.5, 2022));
        books.add(new Book("book5", "author5", 5.0, 2019));
        System.out.println("books before sorting by year");
        for (Book book: books) {
            System.out.println(book);
        }
        Collections.sort(books);
        System.out.println("books after sorting by year");
        for (Book book: books) {
            System.out.println(book);
        }
    }

    public void testComparator() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("book1", "author1", 4.5, 2020));
        books.add(new Book("book5", "author5", 5.0, 2019));
        books.add(new Book("book3", "author3", 4.0, 2021));
        books.add(new Book("book4", "author2", 4.5, 2022));
        books.add(new Book("book2", "author2", 3.5, 2020));
        System.out.println("books before sorting");
        for (Book book: books) {
            System.out.println(book);
        }
        Collections.sort(books, new NameComparator());
        System.out.println("books after sorting by Name");
        for (Book book: books) {
            System.out.println(book);
        }
        Collections.sort(books, new RatingComparator());
        System.out.println("books after sorting by rating");
        for (Book book: books) {
            System.out.println(book);
        }

        Collections.sort(books, Comparator.comparing(Book::getAuthor).thenComparing(Book::getRating));
        System.out.println("books after sorting by author and rating");
        for (Book book: books) {
            System.out.println(book);
        }
    }


}
