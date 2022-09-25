package com.org.collektions;

import java.util.Comparator;

public class RatingComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        if (book1.getRating() < book2.getRating()) return -1;
        if (book1.getRating() > book2.getRating()) return 1;
        else return 0;
    }
}
