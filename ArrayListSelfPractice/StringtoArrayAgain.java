package ArrayListSelfPractice;

import java.util.Arrays;

public class StringtoArrayAgain {
    public static void main(String[] args) {
        String arr1 [] = {"123","2323","3434","5656"};
        int newArr[] = new int[arr1.length];

        for (int i =0;i< arr1.length;i++){
            newArr[i] = Integer.parseInt(arr1[i]);
        }

        System.out.println(Arrays.toString(newArr));

    }
}
