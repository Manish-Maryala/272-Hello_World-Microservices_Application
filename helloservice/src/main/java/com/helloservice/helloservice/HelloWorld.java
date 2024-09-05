package com.helloservice.helloservice;
import java.net.URI;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HelloWorld {

	public static void main(String[] args) {
		String hello_Service_Url = "http://localhost:8080/hello";
        String world_Service_Url = "http://localhost:8081/world";
        
        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpRequest hello_Request = HttpRequest.newBuilder()
                    .uri(URI.create(hello_Service_Url))
                    .GET()
                    .build();
            HttpResponse<String> hello_Response = client.send(hello_Request, HttpResponse.BodyHandlers.ofString());
            String hello_Msg = hello_Response.body();

            HttpRequest world_Request = HttpRequest.newBuilder()
                    .uri(URI.create(world_Service_Url))
                    .GET()
                    .build();
            HttpResponse<String> world_Response = client.send(world_Request, HttpResponse.BodyHandlers.ofString());
            String world_Msg = world_Response.body();

            System.out.println(hello_Msg + " " + world_Msg);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

	}

}
