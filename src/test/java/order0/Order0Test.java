package order0;


import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Order0Test {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector(binder -> {
            binder.bind(Buyer.class).toInstance(new Buyer("Walter"));
            binder.bind(Product.class).to(ProductImpl.class);
        });
        Order0 order = injector.getInstance(Order0.class);

        assertNotNull(order.price());
        assertNotNull(order.buyer());
        assertNotNull(order.product());
        assertTrue(order.product() instanceof ProductImpl);
    }

    @Test
    public void testInjectionWithModule() {
        Injector injector = Guice.createInjector(new Order0Module());
        Order0 order = injector.getInstance(Order0.class);

        assertNotNull(order.price());
        assertNotNull(order.buyer());
        assertNotNull(order.product());
        assertTrue(order.product() instanceof ProductImpl);
    }
}
