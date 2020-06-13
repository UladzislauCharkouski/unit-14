package com.epam.unit14.libraryCompare;

import java.util.Comparator;

public class LibraryOperator {
		public static void main(String[] args){
			Library myLibrary = new Library();
			Book bookVasya = new Book("VasyaBook", "Vasya", 2003, 222);
			Book bookPetya = new Book("PetyaBook", "Petya", 2000, 333);
			Book bookValera = new Book("ValeraBook", "Valera", 1999, 111);
			
			myLibrary.add(bookVasya);
			myLibrary.add(bookPetya);
			myLibrary.add(bookValera);
			
			System.out.println(myLibrary.toString());
			System.out.println();
			
			Comparator<Book> ComparatorYear = new ComparatorYear();
			myLibrary.getLibrary().sort(ComparatorYear);
			System.out.println("Sorted by Year");
			System.out.println(myLibrary.toString());
			
			System.out.println();
			
			Comparator<Book> ComparatorPrice = new ComparatorPrice();
			myLibrary.getLibrary().sort(ComparatorPrice);
			System.out.println("Sorted by Price");
			System.out.println(myLibrary.toString());
		}
}
