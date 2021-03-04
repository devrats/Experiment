import java.util.Objects;

class Student {
    private String name;
    private RollNumber rollNumber;
    private byte yearOfJoining;
    private int branchCode;

    public void setRollNumber(RollNumber rollNumber) {
        this.rollNumber = rollNumber;
    }

    public byte getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(byte yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, RollNumber rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return String.format("name of the Student is: " + name + "\n" + rollNumber);
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

    public RollNumber getRollNumber() {
        return rollNumber;
    }

// add the other necessary member methods here
}