package order3;


import com.google.inject.Guice;
import com.google.inject.Injector;
import order0.Order0;
import order0.Order0Module;
import order0.ProductImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Order3Test {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector(new Order3Module());
        Order3 order = injector.getInstance(Order3.class);

        assertNotNull(order.strategy());
        assertTrue(order.strategy() instanceof OrderStrategyImpl3);
        OrderStrategyImpl3 strategy = (OrderStrategyImpl3) order.strategy();

        assertTrue(strategy.repository() instanceof RepositoryImpl);
    }
}
