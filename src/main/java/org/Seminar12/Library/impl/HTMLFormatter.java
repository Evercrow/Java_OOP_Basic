package org.Seminar12.Library.impl;

import org.Seminar12.Library.ElectronicBook;

import java.util.List;

public class HTMLFormatter implements Formatter{
    @Override
    public String format(List<ElectronicBook> bookList) {
        return "HTML formatted "+bookList.toString();
    }
}
