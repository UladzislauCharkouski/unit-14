package com.epam.unit14.libraryCompare;

import java.util.Comparator;

public class ComparatorYear implements Comparator<Book> {
        @Override
        public int compare(Book bookVasya, Book bookPetya) {
            if(bookVasya.getYearPublished() < bookPetya.getYearPublished()){
                return -1;
            }
            else if(bookVasya.getYearPublished() == bookPetya.getYearPublished()){
                return 0;
            }
            else return 1;
        }
}
