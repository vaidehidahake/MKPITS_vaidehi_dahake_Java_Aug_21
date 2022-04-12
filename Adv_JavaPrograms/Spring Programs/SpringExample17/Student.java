package com.example.springex17;

public class Student {
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

    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
