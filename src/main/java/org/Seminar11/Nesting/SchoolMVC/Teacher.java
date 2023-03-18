package org.Seminar11.Nesting.SchoolMVC;

import java.util.Date;
import java.util.List;

public class Teacher extends User{
    int exp;

    List<Integer> groups;

    public Teacher(Date datebirth, String fio, int ID) {
        super(datebirth, fio, ID);
    }
    public Teacher(){
        super(new Date(), "учитель"+ID, ID);
    }
}
