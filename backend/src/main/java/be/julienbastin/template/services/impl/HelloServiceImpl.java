package be.julienbastin.template.services.impl;

import be.julienbastin.template.exception.GreetingMessageNotFoundException;
import be.julienbastin.template.models.Greeting;
import be.julienbastin.template.repositories.api.GreetingRepository;
import be.julienbastin.template.services.api.HelloService;
import org.jspecify.annotations.NonNull;

public class HelloServiceImpl implements HelloService {

    private final GreetingRepository greetingRepository;

    public HelloServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public @NonNull String hello(@NonNull String key) {
        return greetingRepository.findGreetingByKey(key)
                .map(Greeting::getMessage)
                .orElseThrow(() -> new GreetingMessageNotFoundException(key));
    }
}
