package wedding.managment.system.wms.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wedding.managment.system.wms.Entity.EventRequest;
import wedding.managment.system.wms.Entity.User;
import wedding.managment.system.wms.Repository.UserRepository;
import wedding.managment.system.wms.model.UserModel;

import java.util.List;

@Service
public class UserService{
    @Autowired
    UserRepository userRepository;
   // @Autowired
   // EventRequestService eventRequestService;

    public String saveOrUpdate(UserModel userModel){
        User user=new User();
        user.setUsername(userModel.getUsername());
        user.setEmail(userModel.getEmail());
        user.setCnic(userModel.getCnic());
        user.setPhoneNumber(userModel.getPhoneNumber());
        userRepository.save(user);
        return  "success";
        }
    }
