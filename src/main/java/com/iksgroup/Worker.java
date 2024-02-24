package com.iksgroup;

public class Worker extends Employee{
    private double fixedMonthlySalary; // Месячная зарплата(фиксированная)

    public Worker(String name, double fixedMonthlySalary, int experience) {
        super(name, experience);
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    @Override
    public double calculateMonthlySalary() { return fixedMonthlySalary; }
}
