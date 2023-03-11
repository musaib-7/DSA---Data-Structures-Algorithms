public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertNodeBeginning(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void insertNodeEnd(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtDesiredPositon(int position, int value) {
        ListNode NewNode = new ListNode(value);
        if(position == 1) {
            NewNode.next = head;
            head = NewNode;
        }
        else {
            ListNode pointerOne = head;
            int counter = 1;
            while(counter < position - 1) {
                pointerOne = pointerOne.next;
                counter++;
        }
            NewNode.next = pointerOne.next;
            pointerOne.next = NewNode;
        }
        
    }

    public void deleteFirstNode() {
        if(head == null) {
            return;
        } else {
            head = head.next;
            System.gc();

        }
    }

    public ListNode deleteLastNode() {
        if(head == null || head.next == null) 
            return head;
        ListNode previousNodePointer = head;
        ListNode currentNodePointer = head;
        while(currentNodePointer.next != null) {
            previousNodePointer = currentNodePointer;
            currentNodePointer = currentNodePointer.next;
        }
        previousNodePointer.next = null;
        return currentNodePointer;
    }

    public ListNode deleteDesiredNode(int position) {
        if(position == 1) {
            head = head.next;
            System.gc();
            return head;
        } else {
            int counter = 1;
            ListNode previousNodePointer = head;
            ListNode currentNodePointer = head;

            while(counter < position) {
                previousNodePointer = currentNodePointer;
                currentNodePointer = currentNodePointer.next;
                counter++;
            }
            previousNodePointer.next = currentNodePointer.next;
            return currentNodePointer;
        }
    }

    public boolean searchElement(int searchKey) {
        if(head == null)    return false;
        ListNode temp = head;
        while(temp != null) {
            if(temp.data == searchKey)  return true;
            temp = temp.next;
        }
        return false;
    }

    public void display() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null ");
    }

    public void displayWithReference(ListNode temp) {
        //System.out.print("Test");
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null ");
    }
    public int getLengthOfList() {
        if(head == null) return 0;
        int counter = 0;
        ListNode pointer = head;
        while(pointer != null) {
            counter++;
            pointer = pointer.next;
        }
        return counter;
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;


    }

    public ListNode getNthNodeFromEnd(int n) {
        if(head == null)    return null;
        if(n <= 0)  throw new IllegalArgumentException("Invalid value: n = " + n);

        ListNode refPtr = head;
        ListNode mainPtr = head;
        int counter = 0;
        while(counter < n) {
            refPtr = refPtr.next;
            counter++;
        }
        while(refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println(sll.getLengthOfList());
        sll.insertNodeBeginning(100);
        //sll.insertNodeEnd(12);
        sll.insertNodeEnd(13);
        sll.insertAtDesiredPositon(1, 50);
        sll.insertAtDesiredPositon(2, 25);
        sll.display();

        //ListNode reversedList = sll.reverseList(head);
        //sll.displayWithReference(reversedList);

        ListNode nthNode = sll.getNthNodeFromEnd(2);
        System.out.println("Nth node from the end is: " + nthNode.data);

        //sll.deleteFirstNode();
        //sll.deleteFirstNode();
        //sll.deleteLastNode();
        //sll.deleteLastNode();
        //sll.deleteDesiredNode(1);
        //sll.deleteDesiredNode(4);
        //sll.deleteDesiredNode(6);
        System.out.println(sll.searchElement(80));
        sll.display();

        
    }
}