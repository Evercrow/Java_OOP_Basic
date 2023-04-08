package org.Seminar11.Nesting.SchoolMVC.Controller;

import org.Seminar11.Nesting.SchoolMVC.Controller.Query.AddQuery;
import org.Seminar11.Nesting.SchoolMVC.Controller.Query.CreateGroupQuery;
import org.Seminar11.Nesting.SchoolMVC.Controller.Query.DeleteQuery;
import org.Seminar11.Nesting.SchoolMVC.Controller.Query.ViewQuery;
import org.Seminar11.Nesting.SchoolMVC.Model.*;
import org.Seminar11.Nesting.SchoolMVC.View.UserView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// S - контроллер сейчас имеет слишком много разной логики. Нужно оставить только консольный прием, вывод менюшек, и аггрегацию нужных методов из других классов нашей программы
// O - по открытости-закрытости  сделать в выводе меню больше абстракции, чтобы можно было добавлять новые опции в меню и менять сообщения, не залезая в start()
// L  - сам контроллер без иерархии наследников, поэтому данный принцип пока тут не применим.
// I - сегрегация интерфейсав - может понадобится при абстракции взаимодействия с пользователем и хранения БД
// D - Прицип инверсии зависимостей .Здесь принцип уже выполняется, так как единственная  зависимость у нас на User , который явялется для нас достаточно универсальной абстракцией
public class ConsoleMenu {
    public static Scanner input = new Scanner(System.in);





    public void start(){



        UserService<User> us = new UserService();
        List<User> users = new ArrayList<>();
        menu: while(true){
            System.out.println("-------");
            System.out.println("Вы просматриваете базу данных школы.");
            System.out.println("Выберите нужное действие:");

            /*
            //более "закрытый"(универсальный) подход к выводу начального меню, как пример
            List<String> options = MenuLoader.gatherQueryTypes();
            for (int i = 0; i < options.size(); i++){
                System.out.printf("%d.%s\n",i+1,options.get(i));
            }

             */
            System.out.println("1.Добавить нового пользователя");
            System.out.println("2.Просмотр пользователей");
            System.out.println("3.Удаление пользователя");
            System.out.println("4.Создать учебную группу");

            //тут сложнее. Как сделать switch, который динамично подстраивается под количество опций, я не знаю.
            //скорее всего, лучше будет сделать вместо него еще один foreach, но тогда одним списком из строк options не отделаешься, там нужно что-то не одномерное,
            //куда мы положим все нужные описания меню и сами классы, чтобы делать новые экземпляры и пользоваться их методами.
            switch (input.nextInt()){
                case 1:
                    users = new AddQuery().action(users);
                    break;
                case 2:
                    users = new ViewQuery().action(users);
                    break;
                case 3:
                    users = new DeleteQuery().action(users);
                    break;
                case 4:
                    users = new CreateGroupQuery().action(users);
                    break;
                default:
                    System.out.println("Завершаю работу");
                    break menu;
            }
        }
    }



}




