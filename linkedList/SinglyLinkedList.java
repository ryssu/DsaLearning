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

    // delete the first node (works but could've been better)
    public void deleteFirstMine() {
        ListNode node = head;
        head = node.next;
    }

    // delete the first node (video's solution)
    public ListNode deleteFirst() {
        if(head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    // delete the last node (did a better job compared to the delete first node method.)
    public ListNode deleteLast() {
        ListNode previousNode = head;
        
        if(head == null) {
            return null;
        }

        if(head.next == null) {
            ListNode temp = head;
            head = null;
            return temp; 
        }

        while(previousNode.next.next != null) {
            previousNode = previousNode.next;
        }

        ListNode currentNode = previousNode.next;
        previousNode.next = null;
        return currentNode;
    }

    // delete the last node (video's solution)
    public ListNode deleteLast2() {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while(current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    // delete a node at a given position
    public ListNode deleteNode(int position) {
        ListNode node = head;
        if(position == 1) {
            head = head.next;
            node.next = null;
            return node;
        } else if(position < 1) {
            System.out.println("enter a valid position");
            return null;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1 && previous.next != null) {
                previous = previous.next;
                count++;
            }
            if(previous.next == null) {
                System.out.println("out of bounds");
                return null;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            current.next = null;
            return current;
        }
    }

    // delete a node at a given position (video's solution)
    public ListNode deleteNode2(int position) {
        ListNode node = head;
        if(position == 1) {
            head = head.next;
            return node;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            current.next = null;
            return current;
        }
    }

    // search an element in a linked list
    public boolean searchElement(int element) {
        if(head == null) {
            return false;
        }
        ListNode current = head;
        while(current != null) {
            if(current.data == element) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
