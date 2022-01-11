package FinishTask;

public class Operator implements Employee {

    private long fix;
    private long salary;

    public Operator(long fix) {
        this.fix = fix;
    }

    public void setFix(long fix) {
        this.fix = fix;
    }

    @Override
    public long getMonthSalary(long income, long fix) {
       salary = fix;
        return salary;
    }
}
