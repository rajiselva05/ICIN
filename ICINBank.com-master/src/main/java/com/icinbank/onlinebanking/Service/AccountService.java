package com.icinbank.onlinebanking.Service;

import com.icinbank.onlinebanking.Entity.PrimaryAccount;
import com.icinbank.onlinebanking.Entity.SavingsAccount;
import java.security.Principal;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);

}