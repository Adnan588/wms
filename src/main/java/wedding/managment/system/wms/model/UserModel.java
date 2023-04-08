package wedding.managment.system.wms.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import wedding.managment.system.wms.Entity.User;

@Data
@NoArgsConstructor
public class UserModel
{
    private int userId;
    private String username;
    private String email;
    private String phoneNumber;
    private String cnic;

    public UserModel userModel;

    public UserModel(User user) {
        this.userId = user.getUserId();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.phoneNumber = user.getPhoneNumber();
        this.cnic = user.getCnic();
    }
}
