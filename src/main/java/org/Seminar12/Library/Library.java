package org.Seminar12.Library;

import org.Seminar12.Library.impl.Searchable;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    private List<Book> bookList;


    @Override
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book: bookList){
            if (book.getTitle().equals(title)){
                result.add(book);
            }
        }
        return result;
    }
    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book: bookList){
            if (book.getAuthor().equals(author)){
                result.add(book);
            }
        }
        return result;
    }

    public void addBook(Book book){

    }
}
