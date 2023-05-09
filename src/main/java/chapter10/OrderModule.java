package chapter10;

import com.google.inject.AbstractModule;

public class OrderModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PriceService.class).toInstance(new PriceService());
        bind(ProductService.class).to(ProductServiceImpl.class);
    }
}
