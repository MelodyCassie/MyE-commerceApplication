package africa.semicolon.EcommerceApplication.services;

import africa.semicolon.EcommerceApplication.dtos.request.CustomerRegistrationRequest;
import africa.semicolon.EcommerceApplication.dtos.request.UpdateCustomerRequest;
import africa.semicolon.EcommerceApplication.dtos.response.AddProductResponse;
import africa.semicolon.EcommerceApplication.dtos.response.ApiResponse;
import africa.semicolon.EcommerceApplication.dtos.response.CustomerRegistrationResponse;
import africa.semicolon.EcommerceApplication.dtos.response.UpdateCustomerResponse;
import africa.semicolon.EcommerceApplication.exceptions.CustomerNotFoundException;

public interface CustomerService {
    CustomerRegistrationResponse register(CustomerRegistrationRequest request);
    ApiResponse<UpdateCustomerResponse> updateCustomer(Long id, UpdateCustomerRequest request) throws CustomerNotFoundException;

}
