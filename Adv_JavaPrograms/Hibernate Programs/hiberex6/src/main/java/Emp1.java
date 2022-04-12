import javax.persistence.*;

@Entity
public class Emp1 {
    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id", nullable = false)
        private Long id;
    private String empname;
    private String email;

    @AttributeOverrides({
            @AttributeOverride(name = "pincode", column = @Column(name = "home_pincode")),
            @AttributeOverride(name = "city", column = @Column(name = "home_city")),
            @AttributeOverride(name = "state", column = @Column(name = "home_state"))
    })

    @Embedded //it is used to embed value object of address in the entity.
    private Address home_addr;//it is address class obj .Address class is value obj.

    @Embedded
    private Address office_addr;

    public Address getHome_addr() {
        return home_addr;
    }

    public void setHome_addr(Address home_addr) {
        this.home_addr = home_addr;
    }

    public Address getOffice_addr() {
        return office_addr;
    }

    public void setOffice_addr(Address office_addr) {
        this.office_addr = office_addr;
    }

    public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
