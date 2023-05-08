package chapter0;


import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderServiceTest {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector(binder -> {
            binder.bind(BuyerService.class).toInstance(new BuyerService("Walter"));
            binder.bind(ProductService.class).to(ProductServiceImpl.class);
        });
        OrderService order = injector.getInstance(OrderService.class);

        assertNotNull(order.price());
        assertNotNull(order.buyer());
        assertNotNull(order.product());
        assertTrue(order.product() instanceof ProductServiceImpl);
    }

    @Test
    public void testInjectionWithModule() {
        Injector injector = Guice.createInjector(new Order0Module());
        OrderService order = injector.getInstance(OrderService.class);

        assertNotNull(order.price());
        assertNotNull(order.buyer());
        assertNotNull(order.product());
        assertTrue(order.product() instanceof ProductServiceImpl);
    }
}
