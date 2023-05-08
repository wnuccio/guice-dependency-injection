package chapter3;


import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ControllerTest {

    @Test
    public void testInjection() {
        Injector injector = Guice.createInjector(new ControllerModule());
        Controller order = injector.getInstance(Controller.class);

        assertNotNull(order.useCase());
        assertTrue(order.useCase() instanceof UseCaseImpl);
        UseCaseImpl useCase = (UseCaseImpl) order.useCase();

        assertTrue(useCase.repository() instanceof RepositoryImpl);
    }
}
