package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            String clonedTitle = book.getTitle();
            String clonedAuthor = book.getAuthor();
            LocalDate clonedDate = book.getPublicationDate();
            Book clonedBook = new Book(clonedTitle, clonedAuthor, clonedDate);
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }

    @Override
    public String toString() {
        String allLibraryBooks = this.getBooks().stream()
                .map(Book::toString)
                .collect(Collectors.joining("\n", this.getName() + "\n", "."));
        return allLibraryBooks;
    }
}
