package com.kodilla.stream.beautifer;

public class PoemBeautifier {
    public void beautify(String string, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(string));
    }
}
