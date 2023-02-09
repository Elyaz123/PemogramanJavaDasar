package chapter7_Array.latihan;

public class Listing76_LinearSearch {
    public static int linearSerach(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
