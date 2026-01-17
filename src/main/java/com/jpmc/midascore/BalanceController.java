package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Balance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    private final BalanceQuerier balanceQuerier;

    public BalanceController(BalanceQuerier balanceQuerier) {
        this.balanceQuerier = balanceQuerier;
    }

    @GetMapping("/balance")
    public Balance getBalance() {
        return balanceQuerier.query(1L);
    }
}
