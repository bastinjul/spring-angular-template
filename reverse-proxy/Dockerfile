FROM bellsoft/liberica-openjre-alpine-musl:25.0.1
LABEL authors="Julien Bastin"

WORKDIR /app

ENV JAVA_OPTS ""
ENV SPRING_OPTS ""

COPY target/reverse-proxy-*.jar app.jar

COPY entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]