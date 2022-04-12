package com.example.springex4;

public class Employee {
    int id;
    String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Employee(int id,String name) {
        this.id=id;
        this.name = name;
    }

    void display()
    {
        System.out.println("hii"+getId()+""+getName());
    }
}
