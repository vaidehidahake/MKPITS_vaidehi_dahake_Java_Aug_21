package com.example.demo;

public class Account {
    emp1 eob;
    public emp1 getEob()
    {
        return eob;
    }
    public void setEob(emp1 eob)
    {
        this.eob=eob;
    }
    void trans()
    {
        System.out.println(eob.getName()+"transation processed by id"+eob.getId()+"Successfully");
    }

}
