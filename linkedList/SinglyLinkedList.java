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

    // insert a node at a given position
    public void insertTo(int data, int position) {
        ListNode newNode = new ListNode(data);
        ListNode currentNode = head;
        int count = 1;

        if(head == null) {
            head = newNode;
            return;
        }
        if(position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        if(position < 1) {
            System.out.println("Enter a valid value. Positions starts at 1");
            return;
        }

        while(count < position - 1 && currentNode.next != null) {
            currentNode = currentNode.next;
            count++;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    // another way to insert node at a given position (video's solution)
    public void insertTo2(int data, int position) {
        ListNode node = new ListNode(data);
        if(position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }
}
