package chapter50.impl;

import chapter50.Repository;

public class RepositoryImpl implements Repository {

    public RepositoryImpl() {
    }

    @Override
    public void doSomething() {
        System.out.println("do basic logic!");
    }
}
