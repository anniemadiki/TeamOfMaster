package ArrayListSelfPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySizeChange {
    public static void main(String[] args) {
        int [] arr1 = {121,121,2323,4343,565};

        int[] newArr1 = new int[7];

        newArr1 = new int[8];

        newArr1 = new int[10];

        arr1 = new int[10];

        for (int i=0;i< arr1.length;i++)
        {
            newArr1[i] = arr1[i];
        }

        System.out.println(Arrays.toString(newArr1));
        System.out.println(String.valueOf(newArr1.length));
//
//        Scanner sc =new Scanner(System.in);
//        String[] array = sc.nextLine().split(" ");
//
//        System.out.println("Enter the value : "+ array.length);
//        System.out.println(Arrays.toString(array));

    }
}
