package wedding.managment.system.wms.model;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import wedding.managment.system.wms.Entity.User;

@Data
@NoArgsConstructor
public class UserModel
{
    private int userId;
    @NotEmpty
    @Size(min = 4, message = "Username must be min of 4 characters !!")
    private String username;
    @Email(message = "Email address is not Valid !!")
    private String email;

    @NotNull
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
