package ir.MohammadiProjectsOrdibehesht;

public class RightRotate {

    public static void main(String[] args) {

        int[] array = {7,9,5,3,9,7,0};
//        Numbers of Rotation
        int n = 1;
        System.out.println("Display Original Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
//        Rotate
        for (int i = 0; i < n; i++) {
int last;
// Store the last array
last = array[array.length - 1];

            for (int j = array.length -1; j > 0 ; j--) {

                array[j] = array[j-1];

            }
            array[0] = last;
        }
        System.out.println();

        System.out.println("Array after Rotation");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
