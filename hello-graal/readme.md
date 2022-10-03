## Run class file

```bash
javac -d build src/com/hello/Graal.java
```

```bash
java -cp ./build com.hello.Graal
```

## Run jar 

```bash
jar cfvm Hello.jar manifest.txt -C build .
jar tf Hello.jar
```

```bash
java -jar Hello.jar
```

## Run jar as native-image

```bash
native-image -jar Hello.jar
```

```bash
./Hello
```



 