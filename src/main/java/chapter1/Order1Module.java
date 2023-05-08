package chapter1;

import com.google.inject.AbstractModule;
import strategy.Strategy;
import strategy.StrategyImpl1;
import strategy.StrategyImpl2;
import strategy.Strategy1;
import strategy.Strategy2;

public class Order1Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(Strategy.class).annotatedWith(Strategy1.class).to(StrategyImpl1.class);
        bind(Strategy.class).annotatedWith(Strategy2.class).to(StrategyImpl2.class);
    }
}
