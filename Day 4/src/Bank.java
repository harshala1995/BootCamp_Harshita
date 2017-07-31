import Account.AccountServiceImpl;
import Customer.CustomerServiceImpl;

/**
 * Created by marwahh on 7/23/2017.
 */
public class Bank {
    public static void main(String[] args) {
        CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
        customerServiceImpl.details();
        customerServiceImpl.updateAddress();
        customerServiceImpl.updateMobile();

        AccountServiceImpl accountServiceImpl = new AccountServiceImpl();
        accountServiceImpl.open();
        accountServiceImpl.balance();
        accountServiceImpl.deposit();
        accountServiceImpl.withdraw();
        accountServiceImpl.close();
    }
}
