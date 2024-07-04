public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Node insertAtPos(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current.next != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
        return head;
    }

    public Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public Node deleteAtBeginning(Node head) {
        if (head == null)
            return null;
        return head.next;
    }

    public Node deleteAtPos(Node head, int pos) {
        if (head == null)
            return null;
        if (pos == 0)
            return head.next;
        Node current = head;
        for (int i = 0; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        return head;
    }

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

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println((String) null);
    }

    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        Node head = null;
        head = obj.insertAtBeginning(head, 1);
        head = obj.insertAtBeginning(head, 2);
        head = obj.insertAtBeginning(head, 3);
        head = obj.insertAtBeginning(head, 4);
        head = obj.deleteAtBeginning(head);

        obj.printList(head);

        head = obj.insertAtEnd(head, 6);
        obj.printList(head);

    }

}
