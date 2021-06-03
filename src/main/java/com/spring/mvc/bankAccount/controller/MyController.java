package com.spring.mvc.bankAccount.controller;

import com.spring.mvc.bankAccount.entity.BankAccount;

import java.util.List;

import com.spring.mvc.bankAccount.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @Autowired
    private BankAccountService bankAccountService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<BankAccount> allBankAccounts = bankAccountService.getAllAccounts();
        model.addAttribute("allAccounts", allBankAccounts);
        return "all-bankAccount";
    }

    @RequestMapping("/addNewBankAccount")
    public String addNewEmployee(Model model) {
        BankAccount bankAccount = new BankAccount();
        model.addAttribute("bankAccount", bankAccount);
        return "bankAccount-info";

    }

    @RequestMapping("/saveBankAccount")
    public String saveEmployee(@ModelAttribute("bankAccount") BankAccount bankAccount) {
        bankAccountService.saveBankAccount(bankAccount);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("bank_accountId") int id, Model model) {
        BankAccount bankAccount = bankAccountService.getBankAccount(id);
        model.addAttribute("bankAccount", bankAccount);
        return "bankAccount-info";
    }

    @RequestMapping("/deleteBankAccount")
    public String deleteEmployee(@RequestParam("bank_accountId") int id, Model model) {
        bankAccountService.deleteBankAccount(id);
        return "redirect:/";
    }

}
