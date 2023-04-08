package org.Seminar11.Nesting.SchoolMVC.Model;

public interface CreatableUser<U extends User> extends DataService{
    User create(U schoolMember);
}
