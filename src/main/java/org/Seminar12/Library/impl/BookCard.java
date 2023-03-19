package org.Seminar12.Library.impl;

import org.Seminar12.Library.Book;

public class BookCard implements BookGenerator{
    static private int  count;
    public Book book;
    public BookGenre genre;
    @Override
    public Book generateBook() {
        return new Book("Название"+ ++count,"Аноним");
    }

    public BookCard() {
        this.book = generateBook();
        this.genre = new BookGenre();
    }

    @Override
    public String toString() {
        return "BookCard{" +
                "book=" + book +
                ", genre=" + genre +
                '}';
    }
}
