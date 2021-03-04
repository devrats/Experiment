import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class RollNumberFetcher {
    public List<RollNumber> fetchRollNumbersList(List<Student> studentsList) {
        List<RollNumber> list = new ArrayList<>();
        studentsList.stream().forEach(e-> list.add(e.getRollNumber()));
        return list;
    }

    public void fetchRollNumberFromStudent(Student student) {

        student.setRollNumber(new RollNumber(new BigInteger("19150000" +
                         student.getRollNumber().getRollNumber().toString())));
        System.out.println(student);

    }
    // create a method to fetch a roll number from a single student object,
    // and prepend the year of joining as 19,
    // branch code as 150, then a 000, and then
    // the roll number in the student object call it fetchRollNumberFromStudent
}