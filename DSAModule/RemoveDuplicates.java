public class RemoveDuplicates {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning(int data) {
        ListNode temp = new ListNode(data);
        temp.next = head;
        head = temp;

    }

    public void printLinkedList() {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null ");
    }

    public void removeDuplicates() {
        if(head == null)    return;

        ListNode current = head;
        while(current != null && current.next != null) {
            if(current.data == current.next.data) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        RemoveDuplicates sll = new RemoveDuplicates();

        sll.insertAtBeginning(3);
        sll.insertAtBeginning(3);
        sll.insertAtBeginning(2);
        sll.insertAtBeginning(1);
        sll.insertAtBeginning(1);

        sll.printLinkedList();
        sll.removeDuplicates();
        sll.printLinkedList();

    }
}