package africa.semicolon.EcommerceApplication.controller;

import africa.semicolon.EcommerceApplication.dtos.request.CustomerRegistrationRequest;
import africa.semicolon.EcommerceApplication.dtos.request.UpdateCustomerRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class CustomerControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private static final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testRegisterCustomer() throws Exception{
        CustomerRegistrationRequest request = new CustomerRegistrationRequest();
        request.setEmail("jonsnow@email.com");
        request.setPassword("winteriscoming");

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/customer")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapper.writeValueAsBytes(request)))
                .andExpect(status().is2xxSuccessful())
                .andDo(print());
    }

    @Test
    public void testUpdateCustomer() throws Exception{

        UpdateCustomerRequest request = new UpdateCustomerRequest();
        request.setPhoneNumber("+2348020482167");
        request.setAddress("312, Ilasa Avenue");
        mockMvc.perform(patch("/api/v1/customer/3")
                .content("application/json"))
                .andExpect(status().is2xxSuccessful())
                .andDo(print());
    }
}