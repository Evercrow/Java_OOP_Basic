package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.Date;

//S - User и его наследники не делают лишней работы, базовый класс, призванный хранить и манипулировать полями сведений о пользователе
// L - при подстановке в клиентском коде(или контроллере) Student или Teacher на место User у нас ничего не сломается. Это достигается правильной иерархией конструкторов(super.),
// и инициализацией базовых . Можно еще попробовать вынести логику countID вне User в отдельный класс, но это только даст нам возможность сделать наследников независимыми от User при желании ,
// который нам все равно необходим как абстракция (D принцип в других классах)
//O,I,D - не нужны в силу простоты классов, дополнять классы хранения мы можем, просто расширяя семейство наследников и дополняя конструктор нужными полями
public abstract class User {

    Date datebirth;

    String fio;
    int ID;
    protected static int countID = 0 ;

    public Date getDatebirth() {
        return datebirth;
    }

    public String getFio() {
        return fio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public User(Date datebirth, String fio) {
        this.datebirth = datebirth;
        this.fio = fio;
        this.ID = countID++;
    }


}
