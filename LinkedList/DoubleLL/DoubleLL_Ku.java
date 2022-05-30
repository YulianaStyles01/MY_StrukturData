package LinkedList.DoubleLL;

/**
 * @author YoulMin01
 */

public class DoubleLL_Ku {
    class Node {
        float item;
        Node previous;
        Node next;

        public Node(float item) {
            this.item = item;
        }
    }

    Node head, tail = null;

    public void addNode(float item) {
        Node newNode = new Node(item);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            head.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void printNodes() {
        Node current = head;
        if (head == null) {
            System.out.println("Double linked list is empty!");
            return;
        }
        System.out.println("Nodes of double linked list : ");
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoubleLL_Ku Dll = new DoubleLL_Ku();

        Dll.addNode(4.10f);
        Dll.addNode(12.94f);
        Dll.addNode(13.7f);
        Dll.addNode(18.9f);
        Dll.addNode(30.12f);

        Dll.printNodes();
        System.out.println("");
    }
}
