package order3;

import com.google.inject.AbstractModule;
import strategy.Strategy;

public class Order3Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(Strategy.class).to(StrategyImpl3.class);
        bind(Repository.class).to(RepositoryImpl.class);
    }
}
