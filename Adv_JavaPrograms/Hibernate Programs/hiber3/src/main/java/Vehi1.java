import javax.persistence.*;

@Entity
public class Vehi1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String vname;
    @OneToOne
    private Usr1 u2;

    public Usr1 getU2() {
        return u2;
    }

    public void setU2(Usr1 u2) {
        this.u2 = u2;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
