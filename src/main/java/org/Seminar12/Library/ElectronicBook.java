package org.Seminar12.Library;

public class ElectronicBook extends Book{
    String fileFormat;
    double fileSize;

    public ElectronicBook(String title) {
        super(title);
    }

    public ElectronicBook(String title, String author,String fileFormat,double fileSize ) {
        super(title, author);
        this.fileFormat = fileFormat;
        this.fileSize=fileSize;
    }


}
