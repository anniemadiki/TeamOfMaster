package ArrayListSelfPractice;

import java.sql.Array;
import java.util.ArrayList;

public class NewArrayList {

    static ArrayList<String> a1 = new ArrayList<>();

    public static NewArrayList getMyObject(){
        NewArrayList obj1 = new NewArrayList();
        return obj1;
    }

    public void addArrayList(String[] inp1){

        for (int i=0;i< inp1.length;i++){
            a1.add(inp1[i]);
        }
    }

    public void printArrayList() {
        System.out.println(a1);
    }

}

