package ir.MohammadiProjectsOrdibehesht;

import java.util.Arrays;

public class AddNumberArray {

    public static void main(String[] args) {

        int[] array = {7,8,9,10,5,7};
        int n = array.length;
        int [] newArray = new int[n+1];
        int value = 6;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < n; i++) {
newArray[i] = array[i];
        }
        newArray[n] = value;
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
    }
}
