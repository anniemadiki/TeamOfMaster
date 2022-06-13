package ArrayListSelfPractice;

import java.util.ArrayList;

public class NewArrayListTest {
    public static void main(String[] args) {

        NewArrayList obj1 = NewArrayList.getMyObject();
        NewArrayListData obj2 = NewArrayListData.getobj();
//        obj1.addArrayList("Apple");
        obj1.addArrayList(obj2.inpData());
        obj1.printArrayList();




    }
}
