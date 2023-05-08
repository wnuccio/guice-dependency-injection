package chapter3;

import com.google.inject.AbstractModule;

public class ControllerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(UseCase.class).to(UseCaseImpl.class);
        bind(Repository.class).to(RepositoryImpl.class);
    }
}
