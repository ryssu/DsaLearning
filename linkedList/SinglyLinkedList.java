package linkedList;

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

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // find length of a singly linked list
    public int singlyLinkedListLength() {
        // checking if empty
        if(head == null) {
            return 0;
        }

        ListNode current = head;
        int counter = 0;
        while(current != null) {
            counter++;
            current = current.next;
        }

        return counter;
    }

    // insert node in beginning
    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    // insert node at the end
    public void insertLast(int data) {
        ListNode currentNode = head;
        ListNode newNode = new ListNode(data);

        if(head == null) {
            head = newNode;
            return;
        }

        while(currentNode != null) {
            if(currentNode.next == null) {
                currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    // another way to insert node at the end (video's solution)
    public void insertLast2(int data) {
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }
}
