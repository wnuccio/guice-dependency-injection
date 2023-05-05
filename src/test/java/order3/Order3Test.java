package order3;


import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Order3Test {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector(new Order3Module());
        Order3 order = injector.getInstance(Order3.class);

        assertNotNull(order.strategy());
        assertTrue(order.strategy() instanceof StrategyImpl3);
        StrategyImpl3 strategy = (StrategyImpl3) order.strategy();

        assertTrue(strategy.repository() instanceof RepositoryImpl);
    }
}
