```bash 
mvn clean package
```

```bash
java -jar target/mvn-graalvm-0.0.1-SNAPSHOT.jar
```

hello mvn garna


### Build and run

```bash
export USE_NATIVE_IMAGE_JAVA_PLATFORM_MODULE_SYSTEM=false

mvn clean -Pnative -DskipTests package
```

```bash
./target/
```

