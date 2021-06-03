package com.spring.mvc.bankAccount.service;

import com.spring.mvc.bankAccount.entity.BankAccount;

import java.util.List;

public interface BankAccountService {
    public List<BankAccount> getAllAccounts();

    public void saveBankAccount(BankAccount bankAccount);

    public BankAccount getBankAccount(int id);

    public void deleteBankAccount(int id);
}
