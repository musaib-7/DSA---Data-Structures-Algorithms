import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private boolean isEmpty() {
        return head == null;
    }

    private int getLength() {
        return length;
    }

    public class ListNode {

        private int value;
        private ListNode previous;
        private ListNode next;

        private ListNode(int value) {
            this.value = value;
            this.previous = null;
            this.next = null;
        }
    }

    public void insertAtLast(int value) {

        ListNode newNode = new ListNode(value);

        if(isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public void insertAtBeginning(int value) {

        ListNode newNode = new ListNode(value);

        if(isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }

    public void deleteFirstNode() {

        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = head;
        if(head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        System.gc();
        length--;
    }

    public void deleteLastNode() {

        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = head;
        if(head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        System.gc();
        length--;

    }
    public void dispalyFromBeginning() {
        ListNode temp = head;
        
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayFromEnd() {
        ListNode temp = tail;

        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtLast(1);
        dll.insertAtLast(2);
        dll.insertAtLast(3);
        dll.insertAtBeginning(0);
        dll.insertAtBeginning(-1);

        dll.deleteFirstNode();
        dll.deleteLastNode();

        dll.dispalyFromBeginning();
        dll.displayFromEnd();
    }
}