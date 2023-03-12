package wedding.managment.system.wms;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "CNIC")
    private int CNIC;

    @OneToMany
    private List<EventRequest> eventrequestList;

}
