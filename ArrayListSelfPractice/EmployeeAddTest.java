package ArrayListSelfPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeAddTest {
    public static void main(String[] args) {

        Employee e1 = new Employee(101,"Annie",10000);
        Employee e2 = new Employee(102,"Sowjanya",20000);


        ArrayList<Employee> a1 =  new ArrayList<>();
        a1.add(e1);
        a1.add(e2);




        Iterator itr = a1.iterator();
        while(itr.hasNext()){
            Employee emp1 = (Employee) itr.next();
            System.out.println(emp1.getEmpID() +"--" + emp1.getEmpName()+"--"+emp1.getEmpSal());
        }

    }
}
