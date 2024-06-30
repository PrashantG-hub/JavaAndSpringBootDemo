import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ComparatorDemo {

    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Durgesh",12));
        emps.add(new Employee("Ankit",11));
        emps.add(new Employee("Bhavesh",45));
        System.out.println(emps);
        Collections.sort(emps,new NameComparator());
        System.out.println(emps);
    }
}

class Employee {
    private String EmpName;
    private int EpmId;

    @Override
    public String toString() {
        return "Emp [EmpName=" + EmpName + ", EpmId=" + EpmId + "]";
    }

    public Employee(String empName, int epmId) {
        super();
        EmpName = empName;
        EpmId = epmId;
    }

    public String getEmpName() {
        return EmpName;
    }
    public void setEmpName(String empName) {
        EmpName = empName;
    }
    public int getEpmId() {
        return EpmId;
    }
    public void setEpmId(int epmId) {
        EpmId = epmId;
    }
}

