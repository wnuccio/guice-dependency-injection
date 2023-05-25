package chapter60;

import chapter60.impl.RepositoryImpl;
import chapter60.impl.RepositoryLogger;
import chapter60.impl.RepositoryValidator;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServiceTest {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector(new ServiceModule());

        Service service = injector.getInstance(Service.class);

        assertNotNull(service.repository());
        assertTrue(service.repository() instanceof RepositoryValidator);
        assertTrue(service.repository().next() instanceof RepositoryLogger);
        assertTrue(service.repository().next().next() instanceof RepositoryImpl);

        service.findSomething();
    }
}
