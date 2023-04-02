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
    private String savePayment(@RequestBody PaymentModel paymentModel)throws Exception {
        return paymentService.saveOrUpdate(paymentModel);
    }

  //  @PostMapping("/paymentAdd")
   // public Payment addPayment(@RequestBody Payment payment){
   //    return paymentService.savePayment(payment);
 //  }

    @GetMapping("payment(id)")
    public Payment findPaymentById(@PathVariable int paymentId){
       return paymentService.getPaymentById(paymentId);
    }

      @PutMapping("update")
        public Payment updatePayment(@RequestBody Payment payment){
       return paymentService.updatePayment(payment);
   }

      @DeleteMapping("delete(ids)")
    public  String deletePayment(@PathVariable int paymentId){
        return paymentService.deletePayment(paymentId);
    }
}
