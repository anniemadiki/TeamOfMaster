package ArrayListSelfPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        for (int i=0;i<=100;i++){
            myList.add(i);

        }
        System.out.println(myList);

        Iterator itr = myList.iterator();
        System.out.println(itr.hasNext());

        while ((itr.hasNext())){
            System.out.println(itr.next());
        }
    }
}
