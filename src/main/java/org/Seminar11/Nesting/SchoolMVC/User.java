package org.Seminar11.Nesting.SchoolMVC;

import java.util.Date;

public abstract class User {

    Date datebirth;
    String fio;
    static int ID ;


    public User(Date datebirth, String fio, int ID) {
        this.datebirth = datebirth;
        this.fio = fio;
        User.ID = ++ID;
    }
}
