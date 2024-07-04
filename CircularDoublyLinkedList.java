public class CircularDoublyLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Insertion at begining
    public Node insertAtBegining(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            return newNode;
        } else {
            Node tail = head.prev;
            newNode.prev = tail;
            newNode.next = head;
            // Node current = head;
            // while (current.next != head) {
            // current = current.next;
            // }
            head.prev = newNode;
            tail.next = newNode;

        }
        return newNode;
    }

    // Insertion at end
    public Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            return newNode;
        }
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        Node tail = head.prev;
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
        return head;
    }

    // Insertion at position
    public Node insertAtPos(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            return insertAtBegining(head, data);
        }
        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
            if (current == head) {
                throw new IndexOutOfBoundsException("Position is out of bonds length");
            }
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        return head;

    }

    // Deletion at begining
    public Node deleteAtBegining(Node head) {
        if (head == null)
            return null;
        // Node current = head;
        Node tail = head.prev;
        head.next.prev = tail;
        head = head.next;
        tail.next = head;

        return head;
    }

    // Deletion at end
    public Node deleteAtEnd(Node head) {
        if (head == null)
            return null;
        Node tail = head.prev;
        tail.prev.next = head;
        head.prev = tail.prev;
        return head;
    }

    // Deletion at Position
    public Node deleteAtPos(Node head, int pos) {
        if (head == null)
            return null;
        if (pos == 0)
            return deleteAtBegining(head);
        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
            if (current == head) {
                throw new IndexOutOfBoundsException("Position is out of bonds length");
            }
        }
        current.next = current.next.next;
        current.next.prev = current;
        return head;

    }

    public void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node current = head;
            do {
                System.out.print(current.data + "<->");
                current = current.next;

            } while (current != head);
            System.err.print("head");
        }

    }

    public static void main(String[] args) {
        Node head = null;
        CircularDoublyLinkedList cdl = new CircularDoublyLinkedList();
        head = cdl.insertAtBegining(head, 2);
        head = cdl.insertAtBegining(head, 3);
        head = cdl.insertAtBegining(head, 1);
        cdl.printList(head);
        head = cdl.insertAtEnd(head, 4);
        head = cdl.insertAtEnd(head, 5);
        System.out.println();
        cdl.printList(head);
        System.out.println();
        head = cdl.insertAtPos(head, 6, 2);
        cdl.printList(head);
        System.out.println();
        // head = cdl.deleteAtBegining(head);
        // cdl.printList(head);
        // head = cdl.deleteAtEnd(head);
        // cdl.printList(head);
        head = cdl.deleteAtPos(head, 2);
        cdl.printList(head);

    }

}
