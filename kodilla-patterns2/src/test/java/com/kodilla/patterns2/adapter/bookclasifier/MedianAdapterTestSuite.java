package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicYearMedian() {
        //Given
        Book book1 = new Book("John", "About John", 1, "Johnnny");
        Book book2 = new Book("John", "About John", 2, "Johnnny");
        Book book3 = new Book("John", "About John", 3, "Johnnny");
        Book book4 = new Book("John", "About John", 4, "Johnnny");
        Book book5 = new Book("John", "About John", 5, "Johnnny");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicYearMedian(books);
        //Then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testPublicYearMedianSixBooks() {
        //Given
        Book book1 = new Book("John", "About John", 1, "Johnnny");
        Book book2 = new Book("John", "About John", 2, "Johnnny");
        Book book3 = new Book("John", "About John", 3, "Johnnny");
        Book book4 = new Book("John", "About John", 4, "Johnnny");
        Book book5 = new Book("John", "About John", 5, "Johnnny");
        Book book6 = new Book("John", "About John", 6, "Johnnny");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicYearMedian(books);
        //Then
        Assert.assertEquals(3, result);
    }
}
