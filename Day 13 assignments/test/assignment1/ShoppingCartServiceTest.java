package assignment1;

import com.sun.tracing.dtrace.ArgsAttributes;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by marwahh on 8/2/2017.
 */

public class ShoppingCartServiceTest {
    ShoppingCartService shoppingCartService = null;

    @Before
    public void init() {
        shoppingCartService = new ShoppingCartService();
    }

    @Test
    public void addItem() {
        shoppingCartService.addItem(new Product(1, "Product 1", 2000.00, 1));
        assertEquals(true, shoppingCartService.cart.containsKey(1L));
    }

    @Test
    public void countItemWithDifferentId() {
        shoppingCartService.addItem(new Product(1, "Product 1", 2000.00, 1));
        shoppingCartService.addItem(new Product(2, "Product 2", 2000.00, 1));
        assertEquals(2, shoppingCartService.countItems());
    }

    @Test
    public void countItemWithSameId() {
        shoppingCartService.addItem(new Product(1, "Product 1", 2000.00, 1));
        shoppingCartService.addItem(new Product(1, "Product 2", 2000.00, 1));
        assertEquals(2, shoppingCartService.countItems());
    }

    @Test
    public void countItemWithDifferentQuantity() {
        shoppingCartService.addItem(new Product(1, "Product 1", 2000.00, 2));
        shoppingCartService.addItem(new Product(1, "Product 2", 2000.00, 4));
        assertEquals(3, shoppingCartService.countItems());
    }

    @Test
    public void removeItemCheck() {
        shoppingCartService.addItem(new Product(1, "Product 1", 2000.00, 2));
        shoppingCartService.addItem(new Product(1, "Product 2", 2000.00, 4));
        try {
            shoppingCartService.removeItem(1);
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(false, shoppingCartService.cart.containsKey(1L));
    }

    @Test(expected = ItemNotFoundException.class)
    public void ItemNotFoundExceptionCheck() throws ItemNotFoundException {
        //shoppingCartService.addItem(new Product(1, "Product 1", 2000.00, 2));
        shoppingCartService.removeItem(2);
    }


    @Test
    public void totalPriceCheck() {
        shoppingCartService.addItem(new Product(1, "Product 1", 2000.00, 2));
        shoppingCartService.addItem(new Product(1, "Product 2", 2000.00, 4));
        assertEquals(6000, shoppingCartService.totalPrice(), 2);
    }

    @Test
    public void emptyCartCheck() {
        shoppingCartService.addItem(new Product(1, "Product 1", 2000.00, 2));
        shoppingCartService.addItem(new Product(1, "Product 2", 2000.00, 4));
        shoppingCartService.emptyCart();
        assertEquals(0, shoppingCartService.cart.size());
    }

    @After
    public void clear() {
        shoppingCartService = null;
    }
}
