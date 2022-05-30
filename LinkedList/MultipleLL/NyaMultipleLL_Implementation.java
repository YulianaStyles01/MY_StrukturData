package LinkedList.MultipleLL;

/**
 *
 * @author YoulMin01
 */

public class NyaMultipleLL_Implementation {
    public static NodeMultiple createList(String array[], int a) {
        NodeMultiple head = null;
        NodeMultiple temp = null;

        for (int i = 0; i < a; i++) {
            if (head == null) {
                temp = head = new NodeMultiple();
            } else {
                temp.next = new NodeMultiple();
                temp = temp.next;
            }

            temp.data = array[i];
            temp.next = (NodeMultiple) (temp.down = null);
        }

        return head;
    }

    public static void printMultiLevelList(NodeMultiple head) {
        while (head != null) {
            if (head.down != null) {
                printMultiLevelList((NodeMultiple) head.down);
            }
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
