package com.demo.question1;

public class Manager extends Employee{
    double bonus;

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void Display() {
        System.out.println("["+id+" "+name+" "+salary+" "+bonus+"]");
    }
}
