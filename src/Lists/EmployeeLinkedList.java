package Lists;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void AddToFront(EmployeeDummy employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public void PrintList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print("->");
            current = current.getNext();
        }
        System.out.print("NULL");
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

}
