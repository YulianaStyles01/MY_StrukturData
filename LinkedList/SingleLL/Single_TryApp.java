package LinkedList.SingleLL;

import org.w3c.dom.Node;

/**
 *
 * @author YoulMin01
 */

import java.util.Scanner;

public class Single_TryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RepresentasiData B1 = new RepresentasiData("Album", 950_000);
        RepresentasiData B2 = new RepresentasiData("LightStick", 650_000);
        RepresentasiData B3 = new RepresentasiData("MemberShip", 1_500_000);
        Single_Implementation SL = new Single_Implementation();
        int pilih = 0;

        do {
            System.out.println("====APK LINKED LIST====");
            System.out.println("1.Tambah Depan");
            System.out.println("2.Hapus Depan");
            System.out.println("3.Lihat Isi");
            System.out.println("4.Exit");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("1.Album");
                    System.out.println("2.LightStick");
                    System.out.println("3.MemberShip");
                    System.out.print("Pilih = ");
                    int pilih2 = sc.nextInt();
                    if (pilih2 == 1) {
                        Nodeku B = new Nodeku(B1);
                        SL.addNode(B);

                    } else if (pilih2 == 2) {
                        Nodeku B = new Nodeku(B2);
                        SL.addNode(B);

                    } else if (pilih2 == 3) {
                        Nodeku B = new Nodeku(B3);
                        SL.addNode(B);

                    }
                    break;
                case 2:
                    SL.hapusDepan();
                    break;
                case 3:
                    SL.printNode();
                    break;
                case 4:
                    System.out.println("THANK YOU...");
                    break;
            }
        }while (pilih != 4);

    }
}
