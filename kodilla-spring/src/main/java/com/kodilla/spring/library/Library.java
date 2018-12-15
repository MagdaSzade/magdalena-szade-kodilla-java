package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {
    private final List<String> books = new ArrayList<>();

    @Autowired
    private LibraryDbController libraryDbController;

    /*
    @Autowired
    public void setLibraryDbController(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    @Autowired
    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
        this.libraryDbController = new LibraryDbController();
    }
    */

    public void saveToDd() {
        this.libraryDbController.saveData();
    }

    public void loadFromDb() {
        this.libraryDbController.loadData();
    }
}
