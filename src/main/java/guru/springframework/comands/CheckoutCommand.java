package guru.springframework.comands;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Created by jt on 2/1/16.
 */

@Data
public class CheckoutCommand {

    @NotEmpty
    @Size(min = 2, max = 50)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String lastName;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String addressLine1;
    private String addressLine2;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String city;

    @NotEmpty
    @Size(min = 2, max = 2)
    private String stateCode;

    @NotEmpty
    @Size(min = 5, max = 10)
    private String zipCode;
}
