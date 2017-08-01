package assignment1;

/**
 * Created by marwahh on 8/1/2017.
 */
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void details() {
        System.out.println("Displaying Details");
    }

    @Override
    public void updateAddress() {
        System.out.println("Updating address");
    }

    @Override
    public void updateMobile() {
        System.out.println("Updating mobile no");
    }
}
