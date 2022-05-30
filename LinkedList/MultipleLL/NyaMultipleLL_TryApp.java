package LinkedList.MultipleLL;

import static LinkedList.MultipleLL.NyaMultipleLL_Implementation.createList;
import static LinkedList.MultipleLL.NyaMultipleLL_Implementation.printMultiLevelList;

/**
 *
 * @author YoulMin01
 */

public class NyaMultipleLL_TryApp {
    public static void main(String[] args) {
        String array1[] = {"Memiliki", "Berbagai", "Languange"};
        String array2[] = {"BANGTAN", "ARMY"};
        String array3[] = {"Love"};
        String array4[] = {"SONYEONDAN", "dan", "Fangirl"};

        NodeMultiple head1 = createList(array1, array1.length);
        NodeMultiple head2 = createList(array2, array2.length);
        NodeMultiple head3 = createList(array3, array3.length);
        NodeMultiple head4 = createList(array4, array4.length);


        head1.down = head2;
        head1.next.next.down = head3;
        head2.next.down = head4;

        NodeMultiple head = null;
        head = head1;

        printMultiLevelList(head);
        System.out.println("");
    }
}
