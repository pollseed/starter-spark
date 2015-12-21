package org.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        spark.Spark.get("/hello", (request, response) -> "Hello, World!");
    }
}
