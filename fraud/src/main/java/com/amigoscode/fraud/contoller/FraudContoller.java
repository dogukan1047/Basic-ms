package com.amigoscode.fraud.contoller;

import com.amigoscode.fraud.services.FraudCheckServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/mc1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudContoller {
    private final FraudCheckServices fraudCheckServices;


    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
        boolean isFraudulentCustomer = fraudCheckServices.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }


}
