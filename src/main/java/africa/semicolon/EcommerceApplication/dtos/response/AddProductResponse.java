package africa.semicolon.EcommerceApplication.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class AddProductResponse{
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private Integer quantity;
}
