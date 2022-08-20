package funs.puppys.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import funs.puppys.web.mapper.AccountMapper;
import funs.puppys.web.model.Account;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountMapper mapper;
    /**
     * @return
     */
    @GetMapping("/id")
    Account id(@RequestParam long id){
        return mapper.find(id);
    }
    @GetMapping
    Account account(){
        return new Account();
    }


}
