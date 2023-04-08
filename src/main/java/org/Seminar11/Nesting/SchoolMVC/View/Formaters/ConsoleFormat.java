package org.Seminar11.Nesting.SchoolMVC.View.Formaters;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;

public class ConsoleFormat implements Formatter{

    @Override
    public String buildUserEntry(User u) {
        return String.format("ФИО:%s id:%d ДР:%s \n",u.getFio(), u.getID(),u.getDatebirth());
    }
}
