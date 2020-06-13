package com.epam.unit14.libraryCompare;

import java.util.Comparator;

public class ComparatorPrice implements Comparator<Book> {
    @Override
    public int compare(Book bookVasya, Book bookPetya) {
        if(bookVasya.getPrice() < bookPetya.getPrice()){
            return -1;
        }
        else if(bookVasya.getPrice() == bookPetya.getPrice()){
            return 0;
        }
        else return 1;
    }
}
