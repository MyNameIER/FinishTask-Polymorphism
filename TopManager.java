package FinishTask;

public class TopManager implements Employee {

    private long income;
    private long fix;
    private long salary;

    public TopManager(int income, int fix) {
        this.income = income;
        this.fix = fix;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    @Override
    public long getMonthSalary(long income, long fix) {
        if (income > 10000000) {
            salary = fix + Math.round(income * 0.15);
        }
        else
            salary = fix;
        return salary;
    }
}
