package chapter50;

import chapter50.impl.RepositoryImpl;
import chapter50.impl.RepositoryLogger;
import chapter50.impl.RepositoryValidator;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ServiceModule extends AbstractModule {

    @Provides
    public Repository provideRepository() {
        return new RepositoryValidator(
                new RepositoryLogger(
                    new RepositoryImpl()));
    }
}
