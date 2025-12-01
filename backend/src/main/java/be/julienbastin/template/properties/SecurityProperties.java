package be.julienbastin.template.properties;

import jakarta.validation.constraints.NotNull;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("pattern.security")
public record SecurityProperties(@NonNull @NotNull String allowedCors) {

    public String[] allowedCorsUrls() {
        return allowedCors.split(";");
    }
}
