import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    
    private ListNode last;
    private int length;

    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public CircularSinglyLinkedList() {
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }

    public void insertAtBeginning(int value) {
        ListNode newNode = new ListNode(value);

        if(last == null) {
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public void insertAtLast(int value) {
        ListNode newNode = new ListNode(value);

        if(last == null) {
            last = newNode;
            newNode.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void deleteAtBeginning() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if(last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
    }

    public void deleteAtLast() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        ListNode storePosition = last.next;

        while(temp.next != last) {
            temp = temp.next;
        }

        temp.next.next = null;
        temp.next = storePosition;
        last = temp;
        length--;
    }

    public void display() {
        ListNode temp = last;

        do {
            temp = temp.next;
            System.out.print(temp.value + " -> ");
        } while(temp != last);
        System.out.println("null");
    }
    public static void main(String[] args) {
        
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.insertAtBeginning(3);
        csll.insertAtBeginning(2);
        csll.insertAtBeginning(1);
        csll.insertAtLast(4);
        csll.insertAtLast(5);  

        csll.display(); 

        csll.deleteAtBeginning();      

        csll.display();

        csll.deleteAtLast();
        csll.deleteAtLast();

        csll.display();
        
    }
}
