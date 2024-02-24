package com.iksgroup;

public class Freelancer extends Employee{
    private double hourlyRate; // Почасовая зарплата

    public Freelancer(String name, double hourlyRate, int experience) {
        super(name, experience);
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double calculateMonthlySalary() { return 20.8 * 8 * hourlyRate; }
}
