package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.Date;
import java.util.List;
import java.util.Random;


public class Teacher extends User{
    int exp;

    List<Integer> groups;

    public Teacher(Date datebirth, String fio) {
        super(datebirth, fio);
    }
    public Teacher(){
        super(new Date(), "учитель"+countID);
        this.exp = new Random().nextInt(4);

    }

    @Override
    public String toString() {
        return String.format("id=%d,ФИО %s,дата рождения %s,стаж %d г, преподает в группах: ", ID, fio, datebirth, exp) + groups.toString();
    }
}
