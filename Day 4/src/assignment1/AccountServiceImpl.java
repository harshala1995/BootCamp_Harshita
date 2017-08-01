package assignment1;

/**
 * Created by marwahh on 8/1/2017.
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public void open() {
        System.out.println("Opening Account");
    }

    @Override
    public void close() {
        System.out.println("Closing Account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing Ammount");
    }

    @Override
    public void deposit() {
        System.out.println("Depositing Ammount");
    }

    @Override
    public void balance() {
        System.out.println("Check Balance");
    }
}
