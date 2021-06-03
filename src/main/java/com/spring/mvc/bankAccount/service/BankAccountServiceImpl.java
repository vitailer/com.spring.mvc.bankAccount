package com.spring.mvc.bankAccount.service;

import com.spring.mvc.bankAccount.dao.BankAccountDAO;
import com.spring.mvc.bankAccount.entity.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BankAccountServiceImpl implements BankAccountService {
    @Autowired
    private BankAccountDAO bankAccountDAO;
    @Override
    @Transactional
    public List<BankAccount> getAllAccounts() {
        return bankAccountDAO.getAllAccounts();
    }

    @Override
    @Transactional
    public void saveBankAccount(BankAccount bankAccount) {
       bankAccountDAO.saveBankAccount(bankAccount);
    }

    @Override
    @Transactional
    public BankAccount getBankAccount(int id) {
        return bankAccountDAO.getBankAccount(id);
    }

    @Override
    @Transactional
    public void deleteBankAccount(int id) {
      bankAccountDAO.deleteBankAccount(id);
    }
}
