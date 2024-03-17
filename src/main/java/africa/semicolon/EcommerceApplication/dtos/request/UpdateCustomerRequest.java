package africa.semicolon.EcommerceApplication.dtos.request;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UpdateCustomerRequest {

    private String email;
    private String address;
    private String phoneNumber;

}
