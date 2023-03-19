package org.Seminar12.Library.impl;

import org.Seminar12.Library.ElectronicBook;

import java.util.List;

public class JSONFormatter implements Formatter{
    @Override
    public String format(List<ElectronicBook> bookList) {
        return "json "+bookList.toString();
    }
}
