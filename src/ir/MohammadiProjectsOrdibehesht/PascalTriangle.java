package ir.MohammadiProjectsOrdibehesht;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, a, b, arr[][], p;
        System.out.println("Please enter number of rows:");
        num = sc.nextInt();
        p = num -1;
        arr = new int[num][num];
        for(a = 0; a < num; a++)
        {
            for(b = 0; b <= a; b++)
                if(b == 0 || b == a)
                    arr[a][b] = 1;
                else
                    arr[a][b] = arr[a - 1][b - 1] + arr[a - 1][b];
        }
        System.out.println("Pascal's triangle: \n");
        for(a = 0; a < num; a++)
        {
            for(b = 0; b <= p; b++)
                System.out.print(" ");
            p--;
            for(b = 0; b <= a; b++)
                System.out.print(arr[a][b] + " ");
            System.out.println();
        }
        sc.close();
    }
}



