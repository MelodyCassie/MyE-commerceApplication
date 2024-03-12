package africa.semicolon.EcommerceApplication.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse <T>{
    private T data;
}
