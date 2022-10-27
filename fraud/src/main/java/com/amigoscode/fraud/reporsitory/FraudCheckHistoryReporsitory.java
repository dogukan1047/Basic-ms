package com.amigoscode.fraud.reporsitory;

import com.amigoscode.fraud.model.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistoryReporsitory extends JpaRepository<FraudCheckHistory, Integer> {


}
