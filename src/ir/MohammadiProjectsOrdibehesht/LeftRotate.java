package ir.MohammadiProjectsOrdibehesht;

public class LeftRotate {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int n = 1;
        System.out.println("Display Main Array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            int first;

            first = array[0];
            int j;
            for (j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }

            array[j] = first;


        }
        System.out.println();
        System.out.println("Array after Rotate");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
