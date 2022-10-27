package com.amigoscode.fraud.services;


import com.amigoscode.fraud.model.FraudCheckHistory;
import com.amigoscode.fraud.reporsitory.FraudCheckHistoryReporsitory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
@AllArgsConstructor
public class FraudCheckServices {

    private final FraudCheckHistoryReporsitory fraudCheckHistoryReporsitory;



    public Boolean isFraudulentCustomer(Integer customerId){
        fraudCheckHistoryReporsitory.save(
                FraudCheckHistory.builder()
                        .Customerid(customerId)
                        .iSFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }

}
