##### jakarta 11 setup

1. create domain
```
asadmin create-domain vendomain
asadmin start-domain vendomain
```


```
mvn clean package
asadmin --port 4848 deploy --force=true target/ee10-demo.war
curl http://localhost:8080/ee10-demo/api/hello

```