package com.example.demo;

public class emp1 {
    int id;
    String name;
    public int getId()
    {
    return id;
    }
    public void setId(int id)
    {
        this.id=id;

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println("hi"+getId()+""+getName());
    }


}
