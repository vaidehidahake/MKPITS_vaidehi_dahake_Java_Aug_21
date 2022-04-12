import javax.persistence.*;

@Entity
public class Vehi2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String vnam;

    public String getVnam() {
        return vnam;
    }

    public void setVnam(String vnam) {
        this.vnam = vnam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
