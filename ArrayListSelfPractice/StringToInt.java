package ArrayListSelfPractice;

import java.util.Arrays;

public class StringToInt {
    public static void main(String[] args) {
        String [] a = {"123","232","232","2323"};
        int[] newA = new int[a.length];

        for (int i=0;i<a.length;i++){

            newA[i] = Integer.parseInt(a[i]);

        }

        for (int val:newA){
            System.out.print(val + " ");
        }
        System.out.println(newA);

        System.out.println(Arrays.toString(newA));
    }
}
