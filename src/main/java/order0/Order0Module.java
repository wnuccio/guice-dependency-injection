package order0;

import com.google.inject.AbstractModule;

public class Order0Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(Buyer.class).toInstance(new Buyer("Walter"));
        bind(Product.class).to(ProductImpl.class);
    }
}
