package wedding.managment.system.wms;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    private int userId;
    @Column(name = "user_name")
    private String username;
    @Column(name = "phone_number")
    private int phoneNumber;
    @Column(name = "CNIC")
    private int CNIC;

    @OneToMany
    @JoinColumn(name = "eventId")
    private EventRequest eventrequest;

}
