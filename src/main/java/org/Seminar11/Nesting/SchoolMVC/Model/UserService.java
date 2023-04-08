package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;
// страдает принцип D  - зависим от конкретных классов. Лучше проверять только верхний уровень User, а создавать динамически в зависимости от входного класса
// нашел newInstance() , но он "устаревший", зато просто и  работает :)
// плюс, обобщение с ограничением позволит избежать лишней проверки типа
public class UserService<U extends User> implements DataService<U> {

    @Override
    public User create(U schoolMember){

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
