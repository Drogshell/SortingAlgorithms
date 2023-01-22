package Lists;

public class EmployeeNode {

    // This is a very simple implementation of a singly linked list.
    // Java has its own linked list system, this is just for learning purposes.
    private EmployeeDummy employeeDummy;
    private EmployeeNode next;

    public EmployeeNode(EmployeeDummy employeeDummy) {
        this.employeeDummy = employeeDummy;
    }

    public EmployeeDummy getEmployeeDummy() {
        return employeeDummy;
    }

    public void setEmployeeDummy(EmployeeDummy employeeDummy) {
        this.employeeDummy = employeeDummy;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employeeDummy.toString();
    }
}
