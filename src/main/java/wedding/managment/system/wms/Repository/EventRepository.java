package wedding.managment.system.wms.Repository;
import org.springframework.data.repository.CrudRepository;
import wedding.managment.system.wms.EventRequest;
public interface EventRepository extends CrudRepository<EventRequest,Integer> {
}

