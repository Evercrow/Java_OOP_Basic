package org.Seminar11.Nesting.SchoolMVC.View;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.Student;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.StudyGroup;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.Teacher;


// groupView может как и быть наследником UserView, так и стать отдельным родителем иерархии различных типов вывода состава групп.
// если группы будут также храниться упорядоченным списком, то groupView можно сделать через viewSpecific() и конкретный номер группы.
public class GroupView<T extends Teacher,S extends Student> {

    public String groupView(StudyGroup<T,S> viewed){
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
