package chapter60;

import chapter60.impl.RepositoryImpl;
import chapter60.impl.RepositoryLogger;
import chapter60.impl.RepositoryValidator;
import com.google.inject.Provider;
import com.google.inject.Provides;

public class RepositoryProvider implements Provider<Repository> {

    @Provides
    public Repository get() {
        return new RepositoryValidator(
                new RepositoryLogger(
                    new RepositoryImpl()));
    }
}
