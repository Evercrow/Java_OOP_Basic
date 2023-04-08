package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;

//у класса теперь есть возможность подключать желаемые интерфейсы. При дальнейшем разделении можно будет легко перенести имплементацию и отключить ненужный интерфейс.
public class UserService<U extends User> implements DataService,ReadableUser<U>,CreatableUser<U> {


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
