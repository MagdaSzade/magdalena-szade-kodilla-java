package com.kodilla.exceptions.main;

import com.kodilla.exceptions.io.FileReader;
import com.kodilla.exceptions.io.FileReaderException;
import com.kodilla.exceptions.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading file!");
        }

    }
}
