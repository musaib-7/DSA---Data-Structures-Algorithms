import java.util.EmptyStackException;

public class StackLinkedList {

    private ListNode tos;
    private int length;

    public StackLinkedList() {
        this.tos = null;
        this.length = 0;
    }

    private class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void pushIntoStack(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = tos;
        tos = newNode;
        length++;
    }

    public void popFromStack() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        tos = tos.next;
        length--;
    }

    public void displayStack() {
        ListNode temp = tos;
        int index = 0;
        int length = getLength();
        while(index < length) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            index++;
        }
        System.out.println("null");
    }

    public int peekStack() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return tos.data;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.pushIntoStack(1);
        stack.pushIntoStack(2);
        stack.pushIntoStack(3);
        stack.pushIntoStack(4);
        stack.pushIntoStack(5);

        stack.displayStack();

        stack.popFromStack();
        stack.pushIntoStack(6);
        stack.displayStack();
    }
}