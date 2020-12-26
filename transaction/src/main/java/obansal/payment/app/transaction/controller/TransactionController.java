package obansal.payment.app.transaction.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/transactions")
@Slf4j
public class TransactionController {

    @RequestMapping("/debit/{accountNo}/{amount}")
    public void debitAccount(@PathVariable final String accountNo, @PathVariable final String amount) {
        log.info("Debiting the amount {} from account {}", amount, accountNo);
    }

    @RequestMapping("/credit/{accountNo}/{amount}")
    public void creditAccount(@PathVariable final String accountNo, @PathVariable final String amount) {
        log.info("Credting the amount {} to account {}", amount, accountNo);
    }
}
