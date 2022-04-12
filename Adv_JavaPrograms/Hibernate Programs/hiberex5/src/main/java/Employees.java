import javax.persistence.*;

@Entity
public class Employees {
//        @Id
//        @GeneratedValue(strategy = GenerationType.AUTO)
//        @Column(name = "id", nullable = false)
//        private Long id;
        private String empname;
        private String email;

        @EmbeddedId //it is used to embed value object of address in the entity.
        private Address aobj;//it is address class obj .Address class is value obj.

        public Address getAobj() {
            return aobj;
        }

        public void setAobj(Address addr) {
            this.aobj = addr;
        }

//        public Long getId() {
//            return id;
//        }
//
//        public void setId(Long id) {
//            this.id = id;
//        }

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


