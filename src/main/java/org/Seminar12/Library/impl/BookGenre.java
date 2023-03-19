package org.Seminar12.Library.impl;

import org.Seminar12.Library.Book;

public class BookGenre implements Genre {
    String genre;

    @Override
    public String toString() {
        return "BookGenre{" +
                "genre='" + genre + '\'' +
                '}';
    }

    @Override
    public String getGenre(Book book) {
            return this.genre;
    }

    public BookGenre() {
        this.genre = "неизвестный";
    }

    public BookGenre(String genre) {
        this.genre = genre;
    }
}
