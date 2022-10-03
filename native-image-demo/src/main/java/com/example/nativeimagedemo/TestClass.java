package com.example.nativeimagedemo;


public class TestClass {
    public static void main() {
        System.out.println("Hello World from Graalvm with Maven project!!!");
        var x = "Hello";

        System.out.println(x);
        System.out.println(Runtime.getRuntime());

        System.out.println("JVM runtime: " + Runtime.version());
        System.out.println("---------------------------------------------");
        String s = System.getProperty("java.class.path");
        System.out.println(s);

    }
}
