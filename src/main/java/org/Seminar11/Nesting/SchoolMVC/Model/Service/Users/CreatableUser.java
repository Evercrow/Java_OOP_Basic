package org.Seminar11.Nesting.SchoolMVC.Model.Service.Users;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;
import org.Seminar11.Nesting.SchoolMVC.Model.Service.DataService;

public interface CreatableUser<U extends User> extends DataService {
    User create(U schoolMember);
}
