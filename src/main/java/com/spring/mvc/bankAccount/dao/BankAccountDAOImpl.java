package com.spring.mvc.bankAccount.dao;

import com.spring.mvc.bankAccount.entity.BankAccount;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BankAccountDAOImpl implements BankAccountDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override

    public List<BankAccount> getAllAccounts() {
        Session session = sessionFactory.getCurrentSession();
        Query <BankAccount> query = session.createQuery("from BankAccount", BankAccount.class);
        List <BankAccount> allBankAccounts = query.getResultList();
        return allBankAccounts;
    }

    @Override
    public void saveBankAccount(BankAccount bankAccount) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(bankAccount);
           }

    @Override
    public BankAccount getBankAccount(int id) {
        Session session = sessionFactory.getCurrentSession();
        BankAccount bankAccount = session.get(BankAccount.class, id);
        return bankAccount;
    }

    @Override
    public void deleteBankAccount(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<BankAccount> query = session.createQuery("delete from BankAccount where id=:bank_accountId");
        query.setParameter("bank_accountId",id);
        query.executeUpdate();
    }
}
