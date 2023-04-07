package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;

public class UserService<U extends User> implements DataService<U> {

    @Override
    public User create(U schoolMember) throws Exception {
        if (schoolMember instanceof Teacher){
            return new Teacher();
        } else if(schoolMember instanceof Student){
            return new Student();
        } else {
            throw new Exception("This Class is not in database hierarchy");
        }
    }




    @Override
    public void consoleRead(List<U> users) {
        for (U person:users
             ){
            System.out.println(person);
        }
    }
}
