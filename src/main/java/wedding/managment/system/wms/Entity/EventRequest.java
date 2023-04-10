package wedding.managment.system.wms.Entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;
@Entity
@Data
@Table(name = "EventRequest")
public class EventRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private int Id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "event_type")
    private String eventType;
    @Column(name = "num_of_guest")
    private int numOfGuest;
   // @JsonTypeResolver("yyyy-mm-dd")
    @Column(name = "date")
    private Date date;
    @Column(name = "day")
    private String day;
    @Column(name = "time")
    private String time;
    @Column(name = "status")
    private String status;
    @OneToMany
    private List<Payment> paymentList;
    }