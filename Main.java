package FinishTask;

public class Main {
    public static void main(String[] args) {
    Company company = new Company();
    company.hire("Manager");
    company.hire("TopManager");
    company.hireAll(15,7,1);
    company.sortMaxMin(company.arrayList, 10);
    }
}
