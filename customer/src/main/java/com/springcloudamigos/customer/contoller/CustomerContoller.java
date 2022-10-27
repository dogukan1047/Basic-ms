package com.springcloudamigos.customer.contoller;

import com.springcloudamigos.customer.CustomerRegisterRequest;
import com.springcloudamigos.customer.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("api/mc1/customers")
@AllArgsConstructor
public class CustomerContoller {
private final CustomerService customerService;

   @PostMapping
    public void registerCustomer(@RequestBody CustomerRegisterRequest customerRequest){

        log.info("New customer register{}",customerRequest);
        customerService.registerCustomer(customerRequest);
    }

}
