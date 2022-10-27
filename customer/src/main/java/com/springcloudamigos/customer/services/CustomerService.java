package com.springcloudamigos.customer.services;

import com.springcloudamigos.customer.CustomerRegisterRequest;
import com.springcloudamigos.customer.FraudCheckResponse;
import com.springcloudamigos.customer.model.Customer;
import com.springcloudamigos.customer.reporsitory.CustomerReporsitory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService{

    private final CustomerReporsitory customerReporsitory;
    private final RestTemplate restTemplate;
    public void registerCustomer(CustomerRegisterRequest customerRequest) {
        Customer customer=Customer.builder()
                .firstName(customerRequest.firstName())
                .lastname(customerRequest.lastName())
                .email(customerRequest.email())
                .build();

        customerReporsitory.saveAndFlush(customer);

       FraudCheckResponse fraudCheckResponse= restTemplate.getForObject("http://FRAUD/localhost:8081/api/mc1/fraud-check/{customerId}" ,
                FraudCheckResponse.class,customer.getId());

       if(fraudCheckResponse.isFraudster()){
           throw new IllegalStateException("fraudster");
       }

    }
}
