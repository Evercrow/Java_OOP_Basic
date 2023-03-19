package org.Seminar12.Library.impl;

import org.Seminar12.Library.Book;
import org.Seminar12.Library.ElectronicBook;

import java.util.List;

public interface Formatter {
    public String format(List<ElectronicBook> bookList);
}
