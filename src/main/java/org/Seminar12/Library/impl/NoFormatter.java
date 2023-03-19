package org.Seminar12.Library.impl;

import org.Seminar12.Library.ElectronicBook;

import java.util.List;

public class NoFormatter implements Formatter{

    @Override
    public String format(List<ElectronicBook> bookList) {
        return "no format "+bookList.toString();
    }
}
