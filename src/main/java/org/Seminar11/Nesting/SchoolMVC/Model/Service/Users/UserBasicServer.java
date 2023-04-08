package org.Seminar11.Nesting.SchoolMVC.Model.Service.Users;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;

import java.util.List;

public class UserBasicServer<U extends User> extends UserService implements ReadableUser<U>, CreatableUser<U> {
    @Override
    public User create(U schoolMember){
        //метод create теперь не перебирает instanceof, а может создавать любого пользователя с родителем User
        try {
            return schoolMember.getClass().newInstance();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }




    @Override
    public void consoleRead(List<U> users) {
        for (U person:users
        ){
            System.out.println(person);
        }
    }
}
