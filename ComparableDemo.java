import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Durgesh",12));
        emps.add(new Emp("Ankit",11));
        emps.add(new Emp("Bhavesh",45));
        System.out.println(emps);
        Collections.sort(emps);
        System.out.println(emps);
    }
}

class Emp implements Comparable<Emp> {
    private String EmpName;
    private int EpmId;
    @Override
    public int compareTo(Emp o) {
        return this.EpmId-o.EpmId;
    }
    @Override
    public String toString() {
        return "Emp [EmpName=" + EmpName + ", EpmId=" + EpmId + "]";
    }

    public Emp(String empName, int epmId) {
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


