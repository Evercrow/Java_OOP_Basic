package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.Date;

public abstract class User {

    Date datebirth;

    String fio;
    int ID;
    public static int countID ;

    public Date getDatebirth() {
        return datebirth;
    }

    public String getFio() {
        return fio;
    }
    public User(Date datebirth, String fio) {
        this.datebirth = datebirth;
        this.fio = fio;
        this.ID = ++countID;
    }


}
