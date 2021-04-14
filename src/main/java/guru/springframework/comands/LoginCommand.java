package guru.springframework.comands;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by jt on 2/2/16.
 */

@Data
public class LoginCommand {

    @NotEmpty
    @Size(min = 2, max = 50)
    private String username;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String password;
}
