package LinkedList.CircularLL;

/**
 * @author YoulMin01
 */

public class Nya_CircularLL {
    public Node head = null;
    public Node tail = null;

    public void add(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List Kosong");
        } else {
            System.out.print("Node Dari Circular Linked List -> ");
            do {
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Nya_CircularLL circularLL = new Nya_CircularLL();

        circularLL.add(4.13);
        circularLL.add(13.95);
        circularLL.add(21.997);
        circularLL.add(30.2001);

        circularLL.display();
    }
}
