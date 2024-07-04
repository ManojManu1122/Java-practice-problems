public class DoublyLinkedList {
    static class Node {
        int data;
        Node next;
        Node prevNode;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prevNode = null;
        }
    }

    // Insertion at deleteAtBegining

    public Node insertAtBegining(Node head, int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prevNode = newNode;
            newNode.next = head;

        }
        // Node current = head;
        head = newNode;
        return newNode;
        // newNode.prevNode = null;
    }

    // Insert at end

    public Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null)
            return newNode;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prevNode = current;
        return head;
    }

    // Insertion at position

    public Node insertAtPosition(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            if (head != null) {
                head.prevNode = newNode;
            }
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            newNode.prevNode = current;
            if (current.next != null) {
                current.next.prevNode = newNode;
            }
            current.next = newNode;
        }
        return head;
    }

    // Delete at begining

    public Node deleteAtBegining(Node head) {
        if (head != null) {
            Node newHead = head.next;
            if (newHead != null) {
                newHead.prevNode = null;
            }
            head = newHead;
        }
        return head;
    }

    // delete at end
    public Node deleteAtEnd(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    // Delete at position
    public Node deleteAtPos(Node head, int pos) {
        if (pos == 0) {
            if (head != null) {
                return deleteAtBegining(head);
            }
        }
        Node current = head;
        for (int i = 0; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        current.next.prevNode = current;
        return head;
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = null;
        DoublyLinkedList dll = new DoublyLinkedList();
        head = dll.insertAtBegining(head, 1);
        head = dll.insertAtEnd(head, 5);
        head = dll.insertAtPosition(head, 4, 1);
        dll.printList(head);
        head = dll.deleteAtEnd(head);
        dll.printList(head);
        // head = dll.deleteAtBegining(head);

        dll.printList(head);
        head = dll.insertAtBegining(head, 5);
        head = dll.insertAtEnd(head, 6);
        head = dll.insertAtPosition(head, 7, 1);
        dll.printList(head);
        head = dll.deleteAtPos(head, 2);
        head = dll.deleteAtBegining(head);
        dll.printList(head);

    }

}
