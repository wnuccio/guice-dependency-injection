package chapter3;

import chapter3.repositorylayer.Repository1;
import chapter3.repositorylayer.Repository2;
import chapter3.servicelayer.Repository;
import chapter3.servicelayer.Strategy1;
import chapter3.servicelayer.Strategy2;
import chapter3.servicelayer.UseCase;
import chapter3.servicelayer.UseCaseImpl;
import com.google.inject.AbstractModule;

public class ControllerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(UseCase.class).to(UseCaseImpl.class);
        bind(Repository.class).annotatedWith(Strategy1.class).to(Repository1.class);
        bind(Repository.class).annotatedWith(Strategy2.class).to(Repository2.class);
    }
}
