package africa.semicolon.EcommerceApplication.dtos.request;

import lombok.Getter;
import lombok.Setter;

public class UpdateCustomerRequest {
    @Setter
    @Getter
    private String email;
    private String address;
    private String phoneNumber;

}
