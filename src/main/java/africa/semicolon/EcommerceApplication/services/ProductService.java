package africa.semicolon.EcommerceApplication.services;

import africa.semicolon.EcommerceApplication.dtos.request.AddProductRequest;
import africa.semicolon.EcommerceApplication.dtos.response.AddProductResponse;

public interface ProductService {
    AddProductResponse addProduct(AddProductRequest request);

}
