package Experiment2;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 5; index++) {
            String studentFirstName = scanner.nextLine();
            String studentLastName = scanner.nextLine();
            String rollNumber = scanner.nextLine();
            list.add(new Student(new StudentName(studentFirstName,studentLastName)
                    ,new BigInteger(rollNumber)));
        }
        StudentNamesFetcher studentNameFetcher = new StudentNamesFetcher();
        System.out.println(studentNameFetcher.fetchNamesList(list));
        studentNameFetcher.addMr(new Student(new StudentName("Richa","sharma")
                ,new BigInteger("123456789")));
    }
}
