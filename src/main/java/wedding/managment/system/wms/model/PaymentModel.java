package wedding.managment.system.wms.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import wedding.managment.system.wms.Entity.Payment;
@Data
@NoArgsConstructor
public class PaymentModel {
    private int paymentId;

    private int advancePayment;
    private int totalPayment;
    public EventRequestModel eventRequestModel;

}


