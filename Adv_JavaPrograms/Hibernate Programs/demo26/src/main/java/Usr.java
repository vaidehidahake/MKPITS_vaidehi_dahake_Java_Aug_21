import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Usr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String uname;
    @OneToMany(mappedBy = "u1")
    private Collection<Vehi> vob=new ArrayList<Vehi>();

    public Collection<Vehi> getVob() {
        return vob;
    }

    public void setVob(Collection<Vehi> vob) {
        this.vob = vob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
