package order3;

import com.google.inject.AbstractModule;
import strategy.OrderStrategy;

public class Order3Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(OrderStrategy.class).to(OrderStrategyImpl3.class);
        bind(Repository.class).to(RepositoryImpl.class);
    }
}
