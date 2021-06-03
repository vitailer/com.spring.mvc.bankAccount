package com.spring.mvc.bankAccount.dao;

import com.spring.mvc.bankAccount.entity.BankAccount;

import java.util.List;

public interface BankAccountDAO {
    public List<BankAccount> getAllAccounts();

    public void saveBankAccount(BankAccount bankAccount);

    public BankAccount getBankAccount(int id);

    public void deleteBankAccount(int id);
}
