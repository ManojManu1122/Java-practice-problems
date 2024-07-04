public class CircularSinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insertion at begining
    public Node insertAtBegining(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        return newNode;
    }

    // Insertion at end
    public Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        return head;

    }

    // Insertion at position
    public Node insertAtPos(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        if (pos == 0) {
            return insertAtBegining(head, data);
        } else {
            Node current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
                if (current == head) {
                    throw new IndexOutOfBoundsException("Position is out of the bounds of the list.");
                }
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        return head;
    }

    public Node deleteAtBegining(Node head) {
        if (head == null)
            return null;
        else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            head = head.next;
            current.next = head;
        }
        return head;
    }

    public Node deleteAtEnd(Node head) {
        if (head == null)
            return null;
        Node current = head;
        while (current.next.next != head) {
            current = current.next;
        }
        current.next = head;
        return head;
    }

    public Node deleteAtPos(Node head, int pos) {
        if (head == null)
            return null;
        if (pos == 0)
            return deleteAtBegining(head);
        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

    public void printList(Node head) {
        Node current = head;
        do {
            System.out.print(current.data + "<->");
            current = current.next;

        } while (current != head);
        System.out.println("head");

    }

    public static void main(String[] args) {
        Node head = null;
        CircularSinglyLinkedList csl = new CircularSinglyLinkedList();
        head = csl.insertAtBegining(head, 3);
        head = csl.insertAtBegining(head, 2);
        head = csl.insertAtBegining(head, 1);
        head = csl.insertAtEnd(head, 4);
        System.err.println("The Linked list is: ");
        csl.printList(head);
        System.out.println("After inserting at position: ");
        head = csl.insertAtPos(head, 5, 3);
        csl.printList(head);
        // System.out.println("Deleting at beginning");
        // head = csl.deleteAtBegining(head);
        // csl.printList(head);
        // System.out.println("After Deleting at end");
        // head = csl.deleteAtEnd(head);
        // csl.printList(head);
        System.out.println("After deleting at position");
        head = csl.deleteAtPos(head, 2);
        csl.printList(head);

    }

}
