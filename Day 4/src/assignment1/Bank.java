package assignment1;

import org.junit.Test;

/**
 * Created by marwahh on 8/1/2017.
 */
public class Bank {
    @Test
    public void test1() {
        AccountService accountService = new AccountServiceImpl();
        accountService.open();
        accountService.deposit();
        accountService.balance();
        accountService.withdraw();
        accountService.close();

        CustomerService customerService=new CustomerServiceImpl();
        customerService.details();
        customerService.updateAddress();
        customerService.updateMobile();
    }
}
