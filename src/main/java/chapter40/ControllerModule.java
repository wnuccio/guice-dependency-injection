package chapter40;

import chapter40.repositorylayer.Repository1;
import chapter40.repositorylayer.Repository2;
import chapter40.servicelayer.Repository;
import chapter40.servicelayer.Strategy1;
import chapter40.servicelayer.Strategy2;
import chapter40.servicelayer.UseCase;
import chapter40.servicelayer.UseCaseImpl;
import com.google.inject.AbstractModule;

public class ControllerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(UseCase.class).to(UseCaseImpl.class);
        bind(Repository.class).annotatedWith(Strategy1.class).to(Repository1.class);
        bind(Repository.class).annotatedWith(Strategy2.class).to(Repository2.class);
    }
}
