import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eid", nullable = false)
    private int eid;
    private String ename;
   @Lob //we know that  varchar(255) is limited and to extend it we use this.
    private String addr;
    private String empdesc;
    @Temporal(TemporalType.DATE)//it will set only specific date and time as per requirement.
    private Date doj;
//    private static String empdes; hibernate will not recognize static data member and not send in the table.
    @Transient //hibernate will not consider data member and also do not send it to database and it will ignore database.
    private String empdes;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }


    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmpdesc() {
        return empdesc;
    }

    public void setEmpdesc(String empdesc) {
        this.empdesc = empdesc;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getEmpdes() {
        return empdes;
    }

    public void setEmpdes(String empdes) {
        this.empdes = empdes;
    }
}
