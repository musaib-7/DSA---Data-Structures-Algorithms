import java.util.EmptyStackException;

public class StackPractice {
    private ListNode tos;
    int length;

    public StackPractice() {
        this.tos = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = tos;
        tos = newNode;
        length++;
    }

    public void pop() {
        if(isEmpty())
            throw new EmptyStackException();
        tos = tos.next;
        length--;
    }

    public void displayStack() {
        if(isEmpty())
            throw new EmptyStackException();
        ListNode temp = tos;
        int index = 0;
        while(index++ < getLength()) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackPractice stack = new StackPractice();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.displayStack();

        stack.pop();
        stack.push(6);
        stack.displayStack();
    }
}