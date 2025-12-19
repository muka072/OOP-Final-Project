package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testCalculateTotal() {
         
        Product milk = new PackagedProduct("Milk", 2.5, 10);
        assertEquals(25.0, milk.calculateTotal(), "The total price should be 25.0");
    }

    @Test
    public void testGetQuantityOrWeight() {
       
        Product milk = new PackagedProduct("Milk", 2.5, 10);
        assertEquals(10, milk.getQuantityOrWeight(), "The quantity should be 10");
    }

    @Test
    public void testReduceQuantity() {
        Product milk = new PackagedProduct("Milk", 2.5, 10);
        milk.reduceQuantity(2);
        assertEquals(8, milk.getQuantityOrWeight(), "The quantity should be reduced to 8");
    }
}
