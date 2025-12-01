package be.julienbastin.template.repositories.impl;

import be.julienbastin.template.models.Greeting;
import be.julienbastin.template.repositories.api.GreetingRepository;
import be.julienbastin.template.repositories.jpa.GreetingJpaRepository;
import org.jspecify.annotations.NonNull;

import java.util.Optional;

public class GreetingRepositoryImpl implements GreetingRepository {

    private final GreetingJpaRepository greetingJpaRepository;

    public GreetingRepositoryImpl(GreetingJpaRepository greetingJpaRepository) {
        this.greetingJpaRepository = greetingJpaRepository;
    }

    @Override
    @NonNull
    public Optional<Greeting> findGreetingByKey(@NonNull String key) {
        return greetingJpaRepository.findById(key);
    }
}
