package chapter10;


import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderServiceTest {

    @Test
    public void testInjectionWithModule() {
        Injector injector = Guice.createInjector(new OrderModule());
        OrderService instance = injector.getInstance(OrderService.class);

        assertNotNull(instance.priceService());
        assertNotNull(instance.buyerService());
        assertNotNull(instance.productService());
        assertTrue(instance.productService() instanceof ProductServiceImpl);

        System.out.println(instance.getClass().getSimpleName());
        System.out.println(instance.priceService().getClass().getSimpleName());
        System.out.println(instance.buyerService().getClass().getSimpleName());
        System.out.println(instance.productService().getClass().getSimpleName());
    }
}
