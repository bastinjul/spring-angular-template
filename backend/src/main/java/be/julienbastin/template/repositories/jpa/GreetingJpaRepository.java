package be.julienbastin.template.repositories.jpa;

import be.julienbastin.template.models.Greeting;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingJpaRepository extends JpaRepository<@NonNull Greeting, @NonNull String> {
}
