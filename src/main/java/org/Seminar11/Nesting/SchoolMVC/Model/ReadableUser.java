package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;

public interface ReadableUser<U extends User> extends DataService{

    void consoleRead(List<U> users);

}
