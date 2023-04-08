package org.Seminar11.Nesting.SchoolMVC.Model.Service.Users;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;
import org.Seminar11.Nesting.SchoolMVC.Model.Service.DataService;

import java.util.List;

public interface ReadableUser<U extends User> extends DataService {

    void consoleRead(List<U> users);

}
