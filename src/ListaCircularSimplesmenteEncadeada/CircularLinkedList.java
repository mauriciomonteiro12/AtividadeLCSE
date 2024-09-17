package ListaCircularSimplesmenteEncadeada;

public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        newNode.next = head;
    }

    public String display() {
        if (head == null) {
            return "A lista está vazia.";
        }
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        do {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        } while (temp != head);
        return sb.toString().trim();
    }

    public void remove(int data) {
        if (head == null) return;

        Node current = head;
        Node prev;

        if (head.data == data) {
            if (head.next == head) {
                head = null;
            } else {
                while (current.next != head) {
                    current = current.next;
                }
                current.next = head.next;
                head = head.next;
            }
            return;
        }

        do {
            prev = current;
            current = current.next;
        } while (current != head && current.data != data);

        if (current == head) return;

        prev.next = current.next;
    }
}