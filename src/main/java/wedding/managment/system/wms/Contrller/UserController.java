package wedding.managment.system.wms.Contrller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wedding.managment.system.wms.model.UserModel;
import wedding.managment.system.wms.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    UserService userService;
    @PostMapping("/save")
    private String saveUser(@RequestBody UserModel userModel) {
        return userService.saveOrUpdate(userModel);
    }
}
