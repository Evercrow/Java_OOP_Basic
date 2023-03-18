package org.Seminar11.Nesting.SchoolMVC;

import java.util.List;

public interface DataService {
    User create(Teacher teacher);
    User create(Student student);

    List<User> read(List<User> users);
}
