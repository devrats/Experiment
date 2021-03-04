package Experiment2;

import java.util.Objects;

class StudentName {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "StudentName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", optionalMiddleName='" + optionalMiddleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentName that = (StudentName) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(optionalMiddleName, that.optionalMiddleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, optionalMiddleName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOptionalMiddleName() {
        return optionalMiddleName;
    }

    public void setOptionalMiddleName(String optionalMiddleName) {
        this.optionalMiddleName = optionalMiddleName;
    }

    public StudentName(String firstName, String lastName, String optionalMiddleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.optionalMiddleName = optionalMiddleName;
    }

    public StudentName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String optionalMiddleName;
    // add the other necessary member methods here, the name of a student can or cannot have a middle name, so adjust
    // the toString() method accordingly!
}