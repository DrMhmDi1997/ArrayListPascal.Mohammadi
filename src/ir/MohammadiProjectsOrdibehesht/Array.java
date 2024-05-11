package ir.MohammadiProjectsOrdibehesht;

public class Array {

    public static void main(String[] args) {

        int[] array = {9,8,9,6,5,9,8,6,7,4,6,3,5,2,1,0};

        int n = array.length;

        n = removedduplicate(array,n);

        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
        
    }

    private static int removedduplicate(int a [], int n ) {
        if (n == 0 || n == 1) {
            return n;
        }

        int [] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n-1; i++) {
            if (a[i] != a[i + 1]) {
                temp [j++] = a[i];
            }
        }
        temp[j++] = a[n-1];

        for (int i = 0; i < j; i++) {
            a[i] = temp[i];

        }
        return j;
    }
}
