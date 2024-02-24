package com.iksgroup;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//       Создание массива сотрудников
        Employee[] employees = new Employee[6];
        employees[0] = new Freelancer("Иван", 10, 5);
        employees[1] = new Worker("Мария", 2500, 2);
        employees[2] = new Worker("Александр", 3000, 5);
        employees[3] = new Freelancer("Эмиль", 20, 4);
        employees[4] = new Freelancer("Анастасия", 5, 1);
        employees[5] = new Worker("Дмитрий", 3000, 3);

// Вывод сотрудников
        System.out.println("List of employees");
        System.out.println();
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Average monthly salary: " + "$" + employee.calculateMonthlySalary());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println();

// Уникальная сортировка по опыту
        Arrays.sort(employees);
        System.out.println("Sorting the length of service (in ascending order)");
        System.out.println();
        for (Employee employee1 : employees) {
            System.out.println(employee1.getName() + ": " + employee1.getExperience() + " year of experience");
            System.out.println("-----------------------------------");
        }

    }


}