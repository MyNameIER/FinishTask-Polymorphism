package FinishTask;

public class Manager implements Employee {

    private long fix;
    private long salary;

    public Manager(long fix) {
        this.fix = fix;
    }

    public void setFix(long fix) {
        this.fix = fix;
    }

    @Override
    public long getMonthSalary(long income, long fix) {
        salary = Math.round(Math.random() * 622222 * 0.05) + fix;
        return salary;
    }
}
