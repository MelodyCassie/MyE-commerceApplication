package africa.semicolon.EcommerceApplication.controller;

import africa.semicolon.EcommerceApplication.dtos.request.CustomerRegistrationRequest;
import africa.semicolon.EcommerceApplication.dtos.request.UpdateCustomerRequest;
import africa.semicolon.EcommerceApplication.dtos.response.ApiResponse;
import africa.semicolon.EcommerceApplication.dtos.response.CustomerRegistrationResponse;
import africa.semicolon.EcommerceApplication.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @PostMapping
    public ResponseEntity<CustomerRegistrationResponse> registerCustomer(@RequestBody CustomerRegistrationRequest registrationRequest){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(customerService.register(registrationRequest));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateCustomer(@RequestBody UpdateCustomerRequest request, @PathVariable Long id) {
        try {
            return ResponseEntity.ok(customerService.updateCustomer(id, request));

        }catch (Exception exception){
            return ResponseEntity.badRequest().body(new ApiResponse<>("Failed"));
        }
    }

}
