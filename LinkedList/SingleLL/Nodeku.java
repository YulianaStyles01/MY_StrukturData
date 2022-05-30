package LinkedList.SingleLL;

/**
 *
 * @author YoulMin01
 */

public class Nodeku {
    RepresentasiData Data;
    Nodeku Next;
    Nodeku (RepresentasiData d) {
        Data = d;
    }
    public String getData() {
        return Data.getNama();
    }
}
