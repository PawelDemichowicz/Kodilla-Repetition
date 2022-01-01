package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Main library");
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien", LocalDate.of(1954,1,1) );
        Book book2 = new Book("Game of thrones", "George R.R. Martin", LocalDate.of(1996,1,1) );
        Book book3 = new Book("Win", "Harlan Coben", LocalDate.of(2021,1,1) );

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Shallow Clone Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Deep Clone Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assertions.assertEquals(2,library.getBooks().size());
        Assertions.assertEquals(2,cloneLibrary.getBooks().size());
        Assertions.assertEquals(3,deepCloneLibrary.getBooks().size());
    }
}
