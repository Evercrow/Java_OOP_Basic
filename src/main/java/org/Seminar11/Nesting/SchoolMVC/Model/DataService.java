package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;
// S - страдает принцип ответственности. Этот интерфейс лучше сделать более абстрактным, и использовать его как typehint для реализации принципа O
// в имплементирующих классах, а функции создания и чтения разделить
public interface DataService <U extends User>{

    User create(U schoolMember) throws Exception;


    void consoleRead(List<U> users);
}
