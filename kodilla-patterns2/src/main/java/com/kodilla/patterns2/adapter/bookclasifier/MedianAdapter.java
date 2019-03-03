package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();

        Iterator <com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookIterator = bookSet.iterator();
        while (bookIterator.hasNext()) {
            com.kodilla.patterns2.adapter.bookclasifier.librarya.Book  book = bookIterator.next();
            books.put(new BookSignature(book.getSignature()),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                            book.getAuthor(),
                            book.getTitle(),
                            book.getPublicationYear()));
        }
        return averagePublicationYear(books);
    }
}
