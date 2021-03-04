import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public  class Main{
    public static void main(String[] args) {
        List<Student> list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 5; index++) {
            String studentName = scanner.nextLine();
            String rollNumber = scanner.nextLine();
            list.add(new Student(studentName,new RollNumber(new BigInteger(rollNumber))));
        }
        RollNumberFetcher rollNumberFetcher = new RollNumberFetcher();
        System.out.println(rollNumberFetcher.fetchRollNumbersList(list));
        rollNumberFetcher.fetchRollNumberFromStudent(new Student("rahul", new RollNumber
                (new BigInteger("435"))));
    }
}