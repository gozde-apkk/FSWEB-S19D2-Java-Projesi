package com.workintech.SecurityBasics.service;

import com.workintech.SecurityBasics.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account findById(int id);
    Account save(Account account);
    Account delete(int id);
}
