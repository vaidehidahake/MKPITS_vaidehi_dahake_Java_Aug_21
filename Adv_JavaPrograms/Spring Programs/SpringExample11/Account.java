package com.example.springex11;

public class Account {
    Employee eobj;//making object of Employee class in Account class

    public com.example.springex11.Employee getEobj() {
        return eobj;
    }

    public void setEobj(Employee eobj) {
        this.eobj = eobj;
    }
    void trans(){
        System.out.println(eobj.getName()+" Transaction processed by Id:"+eobj.getId()+" successfully");
    }
}
