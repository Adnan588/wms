package wedding.managment.system.wms.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_Id")
    private int paymentId;
    @ManyToOne
    @JoinColumn(name = "event_request_id")
    private EventRequest eventRequest;
    @Column(name = "total_due")
    private int totalDue;
    @Column(name = "total_payment")
    private int totalPayment;
}
