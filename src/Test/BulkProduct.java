package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BulkProductTest {

    @Test
    public void testCalculateTotal() {
        
        Product rice = new BulkProduct("Rice", 1.8, 20);
        assertEquals(36.0, rice.calculateTotal(), "The total price should be 36.0");
    }

    @Test
    public void testGetQuantityOrWeight() {
        
        Product rice = new BulkProduct("Rice", 1.8, 20);
        assertEquals(20, rice.getQuantityOrWeight(), "The weight should be 20kg");
    }

    @Test
    public void testReduceQuantity() {
        
        Product rice = new BulkProduct("Rice", 1.8, 20);
        rice.reduceQuantity(5);
        assertEquals(15, rice.getQuantityOrWeight(), "The weight should be reduced to 15kg");
    }
}
