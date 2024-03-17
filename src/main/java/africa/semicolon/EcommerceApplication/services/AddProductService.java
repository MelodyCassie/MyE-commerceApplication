package africa.semicolon.EcommerceApplication.services;

import africa.semicolon.EcommerceApplication.dtos.request.AddProductRequest;
import africa.semicolon.EcommerceApplication.dtos.response.AddProductResponse;
import africa.semicolon.EcommerceApplication.models.Product;
import africa.semicolon.EcommerceApplication.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddProductService implements ProductService{
    private final ProductRepository productRepository;


    @Override
    public AddProductResponse addProduct(AddProductRequest request) {
        ModelMapper mapper = new ModelMapper();
        Product product = mapper.map(request, Product.class);
        Product savedProduct = productRepository.save(product);
        return mapper.map(savedProduct, AddProductResponse.class);
    }
}
