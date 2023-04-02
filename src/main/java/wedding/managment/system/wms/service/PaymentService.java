package wedding.managment.system.wms.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wedding.managment.system.wms.Entity.EventRequest;
import wedding.managment.system.wms.Entity.Payment;
import wedding.managment.system.wms.Repository.EventRepository;
import wedding.managment.system.wms.Repository.PaymentRepository;
import wedding.managment.system.wms.model.PaymentModel;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    EventRepository eventRepository;

    public String saveOrUpdate(PaymentModel paymentModel)throws Exception{
    Payment payment= new Payment();
    payment.setPaymentId(paymentModel.getPaymentId());
    payment.setTotalPayment(paymentModel.getTotalPayment());
    payment.setTotalDue(paymentModel.getTotalDue());
    EventRequest eventRequest =  eventRepository.findById(paymentModel.getEventRequestModel()
            .getId()).orElseThrow( () -> new Exception("Event not found - " + paymentModel.getEventRequestModel().getId()));
    payment.setEventRequest(eventRequest);
    paymentRepository.save(payment);
    return  "Success";
    }

   // public Payment savePayment(Payment payment) {
   //     return paymentRepository.save(payment);
 //   }
    public Payment getPaymentById(int paymentId){
        return paymentRepository.findById(paymentId).get();
   }

    public String deletePayment(int paymentId){
        paymentRepository.deleteById(paymentId);
        return "payment remove";
    }
   public Payment updatePayment(Payment payment){
       return paymentRepository.save(payment);
   }
}