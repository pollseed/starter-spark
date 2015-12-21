package org.helloworld;

import static spark.Spark.get;
import static spark.Spark.post;

import com.google.gson.Gson;

public class HelloWorld {
    private static final Gson G = new Gson();

    public static void main(String[] args) {

        get("/hello/:name", (request, response) -> "Hello, World! " + request.params("name"));
        post("/hello", (request, response) -> "Hello, World" + request.body());

        get("/ip", (request, response) -> G.toJson(request.ip()));
        get("/host", (request, response) -> G.toJson(request.host()));
        get("/user_agent", (request, response) -> G.toJson(request.userAgent()));

        get("/q", (request, response) -> G.toJson(request.queryString()));
    }
}
