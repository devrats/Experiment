package Experiment2;

import java.util.ArrayList;
import java.util.List;

class StudentNamesFetcher {
    public StudentNamesFetcher() {
    }

    public List<String> fetchNamesList(List<Student> studentsList) {
        List<String> list = new ArrayList<>();
        studentsList.stream().forEach(e-> list.add(e.getName().getFirstName()));
        return list;
    }

    public void addMr(Student student){
        char firstChar = student.getName().getFirstName().charAt(student.getName().getFirstName().length()-1);
        if(firstChar == 'a' || firstChar == 'e' ||firstChar == 'i' ||firstChar == 'o' ||firstChar == 'u'){
            student.getName().setFirstName("Ms. " + student.getName().getFirstName());
        }
        else {
            student.getName().setFirstName("Mr. " + student.getName().getFirstName());
        }
        System.out.println(student);
    }
    // create a method to prepend a "Ms." before the name if the name ends with an
    // 'a', 'e', 'i', 'o' or 'u' (i.e is a female name (INDIAN)) otherwise prepend a "Mr."
}
