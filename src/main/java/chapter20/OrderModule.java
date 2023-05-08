package chapter20;

import chapter20.strategy.StrategyImpl1;
import chapter20.strategy.StrategyImpl2;
import com.google.inject.AbstractModule;

public class OrderModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Strategy.class).annotatedWith(Strategy1.class).to(StrategyImpl1.class);
        bind(Strategy.class).annotatedWith(Strategy2.class).to(StrategyImpl2.class);
    }
}
