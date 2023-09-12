package com.workintech.SecurityBasics.dao;

import com.workintech.SecurityBasics.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
