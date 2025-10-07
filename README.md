# Spring and Angular template

## Backend
TODO: https://www.baeldung.com/hexagonal-architecture-ddd-spring

## Frontend

TODO

## Security
TODO

client=`webapp`, pwd=`OPaHprGOzXrHSgd7J9H68CiW8Bvz7EIS`

Users=`test`, pwd=`test`

## Reverse proxy
TODO

URLs: http://template.localhost

To export the realm and the users with it, connect to the container and use the following command: 
```shell 
 /opt/keycloak/bin/kc.sh export --realm template --dir /tmp --users realm_file
```
Then retrieve the file using the command from your host:
```shell
docker compose cp keycloak:/template-realm.json ./keycloak/template-realm.json
```