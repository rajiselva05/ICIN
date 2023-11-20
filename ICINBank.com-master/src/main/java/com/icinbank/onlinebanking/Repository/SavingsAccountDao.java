package com.icinbank.onlinebanking.Repository;

import com.icinbank.onlinebanking.Entity.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {
    SavingsAccount findByAccountNumber(int accountNumber);
}