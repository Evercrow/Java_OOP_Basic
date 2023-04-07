package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;

public interface DataService <U extends User>{

    User create(U schoolMember) throws Exception;


    void consoleRead(List<U> users);
}
