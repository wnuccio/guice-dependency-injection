package sample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class OrderServiceTest {

    @Test
    void test() {
        Injector injector = Guice.createInjector(binder ->
                binder.bind(DefaultService.class).to(MockedService.class));

        OrderService orderService = injector.getInstance(OrderService.class);

        assertTrue(orderService.internal() instanceof MockedService);
    }
}