package library.models.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterRequest {

    private String email;
    private String name;
    private String password;
    private Integer age;
}
