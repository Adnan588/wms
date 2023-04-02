package wedding.managment.system.wms.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wedding.managment.system.wms.Entity.EventRequest;
@Repository
public interface EventRepository extends JpaRepository<EventRequest,Integer> {
}

