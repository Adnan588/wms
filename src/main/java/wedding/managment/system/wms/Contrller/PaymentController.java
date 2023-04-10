package wedding.managment.system.wms.Contrller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wedding.managment.system.wms.Entity.Payment;
import wedding.managment.system.wms.model.PaymentModel;
import wedding.managment.system.wms.service.PaymentService;

@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping("/payment")
    private String savePayment(@RequestBody PaymentModel paymentModel){
        try{
            return paymentService.saveOrUpdate(paymentModel);
        }catch (Exception e){
            return e.toString();
        }
    }

    @GetMapping("/payment/{id}")
    public Payment findPaymentById(@PathVariable(name = "id") int paymentId){
       return paymentService.getPaymentById(paymentId);
    }

      @PutMapping("/payment/update")
        public Payment updatePayment(@RequestBody Payment payment){
       return paymentService.updatePayment(payment);
   }

      @DeleteMapping("/payment/delete/{id}")
    public  String deletePayment(@PathVariable(name = "id") Integer paymentId){
        return paymentService.deletePayment(paymentId);
    }
}
