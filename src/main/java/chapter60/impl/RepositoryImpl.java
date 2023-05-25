package chapter60.impl;

import chapter60.Repository;

public class RepositoryImpl implements Repository {

    public RepositoryImpl() {
    }

    @Override
    public void doSomething() {
        System.out.println("do basic logic!");
    }
}
