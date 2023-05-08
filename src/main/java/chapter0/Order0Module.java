package chapter0;

import com.google.inject.AbstractModule;

public class Order0Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(BuyerService.class).toInstance(new BuyerService("Walter"));
        bind(ProductService.class).to(ProductServiceImpl.class);
    }
}
