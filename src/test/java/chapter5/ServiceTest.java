package chapter5;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ServiceTest {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector(
                binder -> binder.bind(Interface.class).to(InterfaceImpl.class)
        );

        Service service = injector.getInstance(Service.class);

        assertNotNull(service.anInterface());

        System.out.println(service.getClass().getSimpleName());
        System.out.println(service.anInterface().getClass().getSimpleName());
    }
}
