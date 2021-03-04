package Experiment2;

import java.math.BigInteger;
import java.util.Objects;

class Student {
    private StudentName name;

    @Override
    public String toString() {
        return String.format("name of the Student is: " + name.getFirstName() + "\nroll Number is: " + String.valueOf(rollNumber));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber);
    }

    public StudentName getName() {
        return name;
    }

    public void setName(StudentName name) {
        this.name = name;
    }

    public BigInteger getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(BigInteger rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(StudentName name, BigInteger rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    private BigInteger rollNumber;
    // add the other necessary member methods here
}