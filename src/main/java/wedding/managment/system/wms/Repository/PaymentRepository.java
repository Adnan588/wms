package wedding.managment.system.wms.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wedding.managment.system.wms.Entity.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment,Integer>{
}
