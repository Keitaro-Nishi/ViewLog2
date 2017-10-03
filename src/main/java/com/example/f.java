/*
package com.example;

import test.model.Account;
import test.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    public Account create(Account account, String rawPassword) {
        String encodedPassword = passwordEncoder.encode(rawPassword);
        account.setPassword(encodedPassword);
        return accountRepository.save(account);
    }
}
@RequestMapping(value = "account", method = RequestMethod.POST)
String create(@Validated AccountForm form, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
        return "account/accountForm";
    }
    Account account = new Account();
    account.setEmail(form.getEmail());
    accountService.create(account, form.getPassword());
    return "redirect:/acount/complete";
}

@RequestMapping(value = "account/complete", method = RequestMethod.GET)
String createFinish() {
    return "account/accountComplete";
}
*/