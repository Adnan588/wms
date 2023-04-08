package wedding.managment.system.wms.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import wedding.managment.system.wms.Entity.Payment;
@Data
@NoArgsConstructor
public class PaymentModel {
    private int paymentId;
    private int totalDue;
    private int totalPayment;
    public EventRequestModel eventRequestModel;

   /* public PaymentModel(Payment payment) {
       this.paymentId = payment.getPaymentId();
        this.totalDue = payment.getTotalDue();
        this.totalPayment = payment.getTotalPayment();
    }*/
}


