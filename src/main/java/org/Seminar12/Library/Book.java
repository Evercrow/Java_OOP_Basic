package org.Seminar12.Library;

public class Book {
    String title;
    String author;
    int year;
    int pages;
    String description;
    String genre;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Object getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", description='" + description + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public Object getAuthor() {
        return this.author;
    }
}
