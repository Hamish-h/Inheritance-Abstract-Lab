package Staff;


public abstract class Employee {
    private String name;
    private int NInumber;
    private int salary;

    public Employee(String aName, int NInumber, int aSalary) {
        this.name = aName;
        this.NInumber = NInumber;
        this.salary = aSalary;

    }

    public String getName() {
        return this.name;
    }

    public String setName(String newName) {
        if (newName == null || newName.isEmpty())  {
            return this.name;
        }
         return this.name = newName;
    }

    public int getNInumber() {
        return this.NInumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public double raiseSalary(double increase) {
        if (increase > 0) {
            return this.salary += increase;
        }
        return this.salary;
    }

    public int payBonus(){
        return this.salary/100;
    }


}
