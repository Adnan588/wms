package wedding.managment.system.wms;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "EventRequest")
public class EventRequest {

    @Id
    @Column(name = "event_id")
    private int eventId;
    @Column(name = "user_name")
    private String username;
    @Column(name = "phone_number")
    private int phoneNumber;
    @Column(name = "email")
    private String  email;
    @Column(name = "num_of_guest")
    private int numOfGuest;
    @Column(name = "date")
    private int date;
    @Column(name = "day")
    private String day;
    @Column(name = "status")
    private String status;
    @OneToMany
    @JoinColumn(name = "payment_Id")
    private List<PaymentGateway> paymentGatewayList;
}
