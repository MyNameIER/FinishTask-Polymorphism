package FinishTask;

import java.util.ArrayList;
import java.util.Collections;

public class Company {

    Operator operator = new Operator(20_000);
    Manager manager = new Manager(50_000);
    TopManager topManager = new TopManager(15_000_000, 70_000);

    ArrayList<Integer>arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList1 = new ArrayList();
    ArrayList<Integer> arrayList2 = new ArrayList();
    ArrayList<Integer> arrayList3 = new ArrayList();

    public void hire(String post) {
        switch (post) {
            case "Operator":
                operator.getMonthSalary(0,20_000);
                System.out.println("Принят оператор с зарплатой. " + operator.getMonthSalary(0, 20_000));
                break;
            case "Manager":
                manager.getMonthSalary(0,50_000);
                System.out.println("Принят менеджер с зарплатой. " + manager.getMonthSalary(0, 50_000));
                break;
            case "TopManager":
                topManager.getMonthSalary(15_000_000, 70_000);
                System.out.println("Принят топменеджер с зарплатой. " + topManager.getMonthSalary(15_000_000, 70_000));
                break;
        }
    }

    public void hireAll(int quantityOperator, int quantityManager, int quantityTopManager) {
        for (int i = 0; i < quantityOperator; i++) {
            arrayList1.add(i, (int) operator.getMonthSalary(0, 20_000));
        }

        for (int i = 0; i < quantityManager; i++) {
            arrayList2.add(i, (int) manager.getMonthSalary(0, 50_000));
        }

        for (int i = 0; i < quantityTopManager; i++) {
            arrayList3.add(i, (int) topManager.getMonthSalary(15_000_000, 70_000));
        }

        arrayList.addAll(arrayList1);
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);

        for(int items : arrayList) {
            System.out.println(items);
        }
        System.out.println();
    }

    public void sortMaxMin(ArrayList arrayList, int quandary) {
        Collections.sort(arrayList);

        for (Object number : arrayList) {
            System.out.println(number);
        }
            System.out.println();

        Collections.reverse(arrayList);

        for(int i = 0; i < quandary; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}


