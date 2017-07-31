package Customer;

/**
 * Created by marwahh on 7/23/2017.
 */
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void details() {
        System.out.println("details");
    }

    @Override
    public void updateAddress() {
        System.out.println("address");
    }

    @Override
    public void updateMobile() {
        System.out.println("mobile");
    }
}
