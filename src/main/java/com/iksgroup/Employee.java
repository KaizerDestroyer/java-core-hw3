package com.iksgroup;

abstract class Employee implements Comparable<Employee>{
    private String name;
    private int experience;
    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }


//    Компаратор
    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.experience, otherEmployee.experience);
    }

//    Геттеры
    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }


//    Абстрактный метод калькулятора зарплаты
    public abstract double calculateMonthlySalary();
}
