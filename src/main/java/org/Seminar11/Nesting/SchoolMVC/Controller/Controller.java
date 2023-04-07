package org.Seminar11.Nesting.SchoolMVC.Controller;

import org.Seminar11.Nesting.SchoolMVC.Model.Student;
import org.Seminar11.Nesting.SchoolMVC.Model.Teacher;
import org.Seminar11.Nesting.SchoolMVC.Model.User;
import org.Seminar11.Nesting.SchoolMVC.Model.UserService;
import org.Seminar11.Nesting.SchoolMVC.View.UserView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {




    public void start(){
        System.out.println("Вы просматриваете базу данных школы.\n");
        System.out.println("Выберите нужное действие:\n");
        System.out.println("1.Добавить нового пользователя\n");
        System.out.println("2.Просмотр пользователя\n");
        System.out.println("3.Удаление пользователя\n");
        System.out.println("4.Просмотр всей таблицы\n");

        Scanner input = new Scanner(System.in);
        UserService db = new UserService();
        UserView show = new UserView();
        List<User> users = new ArrayList<>();
        menu: while(true){
            switch (input.nextInt()){
                case 1:
                    try {
                        users.add(db.create(new Student()));
                        users.add(db.create(new Teacher()));
                    } catch(Exception e){
                        System.out.println("Unexpected User Class");
                    }
                    break;
                case 2:
                    show.read(users);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default: break menu;
            }
        }








    }

}




