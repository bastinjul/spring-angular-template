package be.julienbastin.template.services.api;

import be.julienbastin.template.exception.GreetingMessageNotFoundException;
import org.jspecify.annotations.NonNull;

public interface HelloService {

    /**
     * Get the application greeting message for the given key
     * @param key the key corresponding to a greeting message
     * @return the greeting message if any for the given key
     */
    @NonNull
    String hello(@NonNull String key) throws GreetingMessageNotFoundException;

}
