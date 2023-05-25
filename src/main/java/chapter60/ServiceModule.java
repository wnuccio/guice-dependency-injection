package chapter60;

import com.google.inject.AbstractModule;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Repository.class).toProvider(RepositoryProvider.class);
    }
}
