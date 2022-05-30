package LinkedList.SingleLL;

import LinkedList.MultipleLL.NodeMultiple;
import org.w3c.dom.Node;

/**
 *
 * @author YoulMin01
 */

public class Single_Implementation {
    Nodeku head, tail;
    int jumlah;
    public void addNode(Nodeku baru) {
        if (head==null){
            head = baru;
            tail = baru;

        }else{
            baru.Next = head;
            head = baru;
        }
        System.out.println("Penambahan Berhasil...");
    }
    public void  printNode() {
        System.out.print("Isi Dari Linked List : ");
        for (Nodeku a = head; a != null; a=a.Next) {
            System.out.print("[" + tail.getData() + "]");

        }
        System.out.println("");
    }
    public void hapusDepan() {
        if (head == null) {
            System.out.println("Linked List Kosong!");

        }
        else if (head.Next == null) {
            Nodeku a = head;
            System.out.println("(" + a.getData() + ") dihapus");
            head = tail = null;

        } else {
            Nodeku a = head;
            System.out.println("(" + a.getData() + ") dihapus");
            head = head.Next;
            a = null;

        }
    }
}
