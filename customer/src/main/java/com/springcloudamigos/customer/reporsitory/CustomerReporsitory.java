package com.springcloudamigos.customer.reporsitory;

import com.springcloudamigos.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReporsitory extends JpaRepository<Customer,Integer> {
}
