package order1;

import com.google.inject.AbstractModule;
import strategy.OrderStrategy;
import strategy.OrderStrategyImpl1;
import strategy.OrderStrategyImpl2;
import strategy.Strategy1;
import strategy.Strategy2;

public class Order1Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(OrderStrategy.class).annotatedWith(Strategy1.class).to(OrderStrategyImpl1.class);
        bind(OrderStrategy.class).annotatedWith(Strategy2.class).to(OrderStrategyImpl2.class);
    }
}
