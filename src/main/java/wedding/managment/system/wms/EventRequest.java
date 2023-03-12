package wedding.managment.system.wms;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "EventRequest")
public class EventRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private int eventId;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private int user;
    @Column(name = "event_type")
    private String eventType;
    @Column(name = "num_of_guest")
    private int numOfGuest;

    //todo:
    @Column(name = "date")
    private String date;
    @Column(name = "day")
    private String day;

    //todo:
    @Column(name = "time")
    private String time;
    @Column(name = "status")
    private String status;
    @OneToMany
    @JoinColumn(name = "payment_id")
    private List<Payment> paymentList;
    }

