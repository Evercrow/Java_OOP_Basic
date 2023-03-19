package org.Seminar12.Library.impl;

import org.Seminar12.Library.Book;

import java.util.List;

public interface Searchable {
    List<Book> searchByAuthor(String author);
    List<Book> searchByTitle(String title);


}
