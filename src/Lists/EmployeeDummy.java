package Lists;

import java.util.Objects;

public class EmployeeDummy {
    private String firstName;
    private String LastName;
    private int ID;

    public EmployeeDummy(String firstName, String lastName, int ID) {
        this.firstName = firstName;
        LastName = lastName;
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDummy that = (EmployeeDummy) o;
        return ID == that.ID && firstName.equals(that.firstName) && LastName.equals(that.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, LastName, ID);
    }

    @Override
    public String toString() {
        return "EmployeeDummy{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", ID=" + ID +
                '}';
    }
}
