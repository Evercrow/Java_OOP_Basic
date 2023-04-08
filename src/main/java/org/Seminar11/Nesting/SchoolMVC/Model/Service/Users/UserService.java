package org.Seminar11.Nesting.SchoolMVC.Model.Service.Users;

import org.Seminar11.Nesting.SchoolMVC.Model.Service.DataService;

//у класса теперь есть возможность подключать желаемые интерфейсы. При дальнейшем разделении можно будет легко перенести имплементацию и отключить ненужный интерфейс.

//по аналогии с StudyGroupService, теперь это класс-родитель для всех служебных классов для User
public abstract class UserService implements DataService {



}
