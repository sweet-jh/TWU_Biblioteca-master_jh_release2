package com.twu.biblioteca;

/**
 * Created by hjing on 4/26/16.
 */
public class Vedios extends Information {
    private int rate;

    Vedios(String name, String author, int yearPublished, int rate) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.rate = rate;
    }
}
