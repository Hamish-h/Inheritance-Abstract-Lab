package Staff.Management;

public class Director extends Manager {
    private double budget;

    public Director(String aName, int NInumber, int aSalary, String aDeptName, double aBudget) {
        super(aName, NInumber, aSalary, aDeptName);
        this.budget = aBudget;

    }


    public double getBudget() {
        return this.budget;
    }

    public int payBonus() {
        return this.getSalary()/50;
    }
}
