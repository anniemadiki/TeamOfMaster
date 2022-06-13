package ArrayListSelfPractice;

import java.util.Arrays;

public class ConvertIntToString {
    public static void main(String[] args) {
//        int[] array = { 1, 2, 3, 4, 5 };
//        String s = String.join("", IntStream.of(array).mapToObj(String::valueOf).toArray(String[]::new));
//        System.out.println(s);

        int[] nums = {5,1,2,11,3}; //List or Vector

        System.out.println("11111111111111");
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }System.out.println();

        System.out.println("222222222222222222");
        Arrays.sort(nums); //Collections.sort() for List,Vector
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }System.out.println();

        String a=Arrays.toString(nums); //toString the List or Vector
        System.out.println("33333333333");
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            }System.out.println();
        System.out.println("444444444" + a);


        String ar[]=a.substring(1,a.length()-1).split(", ");
        System.out.println("5555555555555");
        for (int i=0;i<nums.length;i++){
            System.out.print(ar[i]);
        }System.out.println();

        System.out.println(Arrays.toString(ar));

    }
}
