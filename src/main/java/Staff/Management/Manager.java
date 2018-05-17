package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String aName, int NInumber, int aSalary, String aDeptName) {
            super(aName, NInumber, aSalary);
            this.deptName = aDeptName;
    }


    public String getDeptName() {
        return this.deptName;
    }
}
