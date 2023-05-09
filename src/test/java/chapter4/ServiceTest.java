package chapter4;

import chapter5.Interface;
import chapter5.InterfaceImpl;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ServiceTest {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector(binder ->
                binder.bind(BuyerService.class).toInstance(new BuyerService("Andrea"))
        );

        Service service = injector.getInstance(Service.class);

        assertNotNull(service.buyerService());

        System.out.println(service.getClass().getSimpleName());
        System.out.println(service.buyerService());
    }
}
