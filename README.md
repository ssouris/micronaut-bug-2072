To reproduce the bug:

using `MICRONAUT_CONFIG_FILES`.

Run the command and see the logs
```
SPRING_CLOUD_CONFIG_URI=https://localhost:9090;MICRONAUT_CONFIG_FILES=/path/to/my-app1/bootstrap.properties ./gradlew run 
```
