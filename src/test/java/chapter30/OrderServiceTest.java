package chapter30;


import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;
import strategy.StrategyImpl1;
import strategy.StrategyImpl2;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderServiceTest {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector(new OrderModule());
        OrderService order = injector.getInstance(OrderService.class);

        assertTrue(order.strategy1() instanceof StrategyImpl1);
        assertTrue(order.strategy2() instanceof StrategyImpl2);
    }
}
