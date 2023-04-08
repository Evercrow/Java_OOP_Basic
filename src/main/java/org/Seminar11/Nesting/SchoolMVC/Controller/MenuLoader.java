package org.Seminar11.Nesting.SchoolMVC.Controller;


import java.util.ArrayList;
import java.util.List;

public class MenuLoader {
    static List<String> gatherQueryTypes(){
        List<String> allQ = new ArrayList<>();
        // Здесь идет имплементация обхода папки org.Seminar11.Nesting.SchoolMVC.Controller.Query
        // через Reflections,  Google Guava,
        // или System Class Loader https://www.baeldung.com/java-find-all-classes-in-package#1-system-class-loader
        return allQ;
    }
}
