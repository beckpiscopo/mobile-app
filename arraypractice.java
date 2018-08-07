

import java.util.Scanner;
import java.util.ArrayList;

public class arraypractice {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ARRAY_SIZE;

        System.out.println("What's your array size?");
        ARRAY_SIZE = scanner.nextInt();

        int[] array = new int[ARRAY_SIZE];

        changeArray(array);

        displayArray(array);


        }




    public static int[] changeArray(int[] a) {
        for(int i=0; i<a.length; i++) {
            a[i] = -1;
        }
        return a;
    }


    public static void displayArray(int[] a) {
        for(int i=0; i < a.length; i++ ) {
            System.out.println(a[i]);
        }

    }

    public static int[] reverseArray(int[] a) {
        int[] reverse =  new int[a.length];
        for(int i = 0, j = a.length-1; i<a.length; i++, j--) {

            reverse[j] = a[i];

        }
        return reverse;
    }


}


