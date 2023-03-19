package org.Seminar11.Nesting.SchoolMVC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    Scanner input = new Scanner(System.in);


    public void start(){
        System.out.println("Вы просматриваете базу данных школы.\n");
        System.out.println("Выберите нужное действие:\n");
        System.out.println("1.Добавить нового пользователя\n");
        System.out.println("2.Просмотр пользователя\n");
        System.out.println("3.Удаление пользователя\n");
        System.out.println("4.Просмотр всей таблицы\n");
//        case input.nextInt(){
//            switch ()

        UserService db = new UserService();
        List<User> users = new ArrayList<>();

        users.add(db.create(new Student()));
        users.add(db.create(new Teacher()));

        UserView show = new UserView();

    }

}




