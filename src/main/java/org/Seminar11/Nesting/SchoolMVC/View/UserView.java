package org.Seminar11.Nesting.SchoolMVC.View;

import org.Seminar11.Nesting.SchoolMVC.Model.Student;
import org.Seminar11.Nesting.SchoolMVC.Model.StudyGroup;
import org.Seminar11.Nesting.SchoolMVC.Model.Teacher;
import org.Seminar11.Nesting.SchoolMVC.Model.User;

import java.util.ArrayList;
import java.util.List;


// S - работу с ID можно вынести в другой класс
// O - вывод в строку достаточно универсален, когда на вход БД коллекцией, а на выход строка.
// НО нужно сделать форматирование строки через отдельные сущности для более простого изменения.
// L - если будем создавать иерархию форматировщиков, то следим за входами-выходами методов
// I - опять, паттерн MVC немного снимает релевантность данного принципа.
// Но если мы будем делать наследников по отдельном типом просмотров, то интерфейсы в них бдум подключать только необходимые
// D - класс завязан только на абстрактного User, принцип выполняется.
// В newGroup нужны обощения, но это все равно лучше сделать в отдельном классе по принципу S
public class UserView {

    public String consoleViewAll(List<User> users) {
        StringBuilder sb = new StringBuilder();
        for (User u:users
             ){
            sb.append(String.format("%s %d %s \n",u.getFio(), u.getID(),u.getDatebirth()));

        }
        return sb.toString();
    }
    public  String consoleViewSpecific ( List<User> users, List<Integer> rows){
        StringBuilder sb = new StringBuilder();

        for (int id:rows
        ){
            User u = users.get(id);
            sb.append(String.format("id:%d, %s,  %s \n", u.getID(),u.getFio(),u.getDatebirth()));

        }
        return sb.toString();
    }

    public List<Integer> getAllStudentID( List<? extends User> db){
         List<Integer> idList = new ArrayList<>();
        for (User u:db
             ){
            if (u instanceof Student){
                idList.add(u.getID());
            }
        }
        return idList;
    }

    public List<Integer> getAllTeacherID( List<? extends User> db){
        List<Integer> idList = new ArrayList<>();
        for (User u:db
        ){
            if (u instanceof Teacher){
                idList.add(u.getID());
            }
        }
        return idList;
    }

    public String groupView(StudyGroup viewed){
            StringBuilder sb = new StringBuilder();
            sb.append("номер группы "+ viewed.getGroupID()+"\n");
            sb.append("Учитель группы "+ viewed.getGroupTeacher()+"\n");
        for (int i = 0; i < viewed.getGroupStudents().size(); i++){
            sb.append(viewed.getGroupStudents().get(i).toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
