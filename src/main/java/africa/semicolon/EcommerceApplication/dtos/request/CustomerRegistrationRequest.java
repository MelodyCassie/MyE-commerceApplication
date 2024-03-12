package africa.semicolon.EcommerceApplication.dtos.request;

import lombok.Getter;
import lombok.Setter;

public class CustomerRegistrationRequest {
    @Getter
    @Setter
    private String email;
    private String password;
}
