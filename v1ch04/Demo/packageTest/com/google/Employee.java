package com.google;
public class Employee{

    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){

        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public double getSalary(){
        return this.salary;
    }
}