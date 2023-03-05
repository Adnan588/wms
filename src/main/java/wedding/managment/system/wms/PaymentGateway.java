package wedding.managment.system.wms;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "payment_gateway")
public class PaymentGateway {
    @Id
    @Column(name = "payment_Id")
    public int paymentGatewayId;
    @Column(name = "user")
    public String user;
    @Column(name = "total_due")
    public int totalDue;
    @Column(name = "total_payment")
    public int totalPayment;

}
