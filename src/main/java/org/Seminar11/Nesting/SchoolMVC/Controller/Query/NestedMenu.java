package org.Seminar11.Nesting.SchoolMVC.Controller.Query;

import org.Seminar11.Nesting.SchoolMVC.Model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Этот интерфейс будут использовать классы, которые делают дополнительные пояснительные надписи своей логики и опций
 */
public interface NestedMenu {
    LinkedList<String> additionalMenu();
    List<User> additionalAction();
}
