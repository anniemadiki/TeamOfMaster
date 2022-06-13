package ArrayListSelfPractice;

public class Employee {
    public int empID;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public String empName;
    public double empSal;

    public Employee(int empID, String empName, double empSal) {
        this.empID = empID;
        this.empName = empName;
        this.empSal = empSal;
    }


}
