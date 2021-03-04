package experiment1;

import java.math.BigInteger;
import java.util.Objects;

class RollNumber {
    private final BigInteger rollNumber;

    RollNumber(BigInteger rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return String.format("Roll number of student is: " + String.valueOf(rollNumber) + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RollNumber that = (RollNumber) o;
        return Objects.equals(rollNumber, that.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }

    public BigInteger getRollNumber() {
        return rollNumber;
    }
    // add the other necessary member methods here, A experiment1.RollNumber object must always be immutable!
}