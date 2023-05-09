package chapter3;


import chapter10.BuyerService;
import chapter10.OrderModule;
import chapter10.OrderService;
import chapter10.ProductService;
import chapter10.ProductServiceImpl;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServiceTest {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector();

        Service service = injector.getInstance(Service.class);

        assertNotNull(service.priceService());

        System.out.println(service.getClass().getSimpleName());
    }
}
