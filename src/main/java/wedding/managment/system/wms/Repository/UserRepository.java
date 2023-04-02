package wedding.managment.system.wms.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wedding.managment.system.wms.Entity.User;
@Repository
public interface UserRepository  extends CrudRepository<User,Integer> {
}
