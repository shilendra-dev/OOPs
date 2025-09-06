// Create a employee class having attributes name and salary and methods getSalary(), setSalary(), setName()
import java.util.*;

class Employee {
    String employeeName;
    int salary;

    public void setName(String s){
        employeeName = s;
    }

    public void setSalary(int val){
        salary = val;
    }

    public int getSalary(){
        return salary;
    }
}