package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");

        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.of(2000, 01, n))));

        Library shallowCopyLibrary = null;
        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Shallow copy Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Deep copy Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        shallowCopyLibrary.getBooks().add(new Book("Mistrz i Małgorzata", "M.Bułhakow", LocalDate.of(1989, 01, 06)));

        //Then
        System.out.println(library.toString());
        System.out.println(shallowCopyLibrary.toString());
        System.out.println(deepCopyLibrary.toString());

        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, shallowCopyLibrary.getBooks().size());
        Assert.assertEquals(10, deepCopyLibrary.getBooks().size());
    }
}
