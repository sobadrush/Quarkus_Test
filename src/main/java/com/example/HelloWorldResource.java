package com.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldResource {

    // 使用 @Inject 進行依賴注入
    @Inject
    private GreetingService greetingService;

    /**
     * 使用 @GET 取得 GET 請求
     * ex: http://localhost:8080/hello
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingService.getHelloMessage();
    }

    /**
     * 使用 @Path 取得 URL 路徑
     * ex: http://localhost:8080/hello/greeting
     */
    @GET
    @Path("/greeting")
    @Produces(MediaType.TEXT_PLAIN)
    public String greeting() {
        return greetingService.getGreetingMessage();
    }


    /**
     * 使用 @PathParam 取得 URL 路徑中的參數
     * ex: http://localhost:8080/hello/greeting/Roger
     */
    @GET
    @Path("/greeting/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String greetingWithName(@PathParam("name") String name) {
        return greetingService.getGreetingMessage(name);
    }

}

