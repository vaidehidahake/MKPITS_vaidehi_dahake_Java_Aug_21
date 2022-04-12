package com.example.springex5;

public class Employee {
    int id;
    String name;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id,String name) {
        this.id=id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    void display(){
        System.out.println("hello " +getId()+" "+getName());
    }
}
