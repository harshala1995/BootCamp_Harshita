package Account;

/**
 * Created by marwahh on 7/23/2017.
 */
public class AccountServiceImpl implements AccountSevice {

    @Override
    public void open() {
        System.out.println("Open");
    }

    @Override
    public void close() {
        System.out.println("close");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw");
    }

    @Override
    public void deposit() {
        System.out.println("deposit");
    }

    @Override
    public void balance() {
        System.out.println("balance");
    }
}
