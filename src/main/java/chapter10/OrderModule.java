package chapter10;

import com.google.inject.AbstractModule;

public class OrderModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(BuyerService.class).toInstance(new BuyerService("Walter"));
        bind(ProductService.class).to(ProductServiceImpl.class);
    }
}
