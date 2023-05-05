package order2;


import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;
import strategy.OrderStrategyImpl1;
import strategy.OrderStrategyImpl2;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Order2Test {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector(new OrderModule2());
        Order2 order = injector.getInstance(Order2.class);

        assertTrue(order.strategy1() instanceof OrderStrategyImpl1);
        assertTrue(order.strategy2() instanceof OrderStrategyImpl2);
    }
}
