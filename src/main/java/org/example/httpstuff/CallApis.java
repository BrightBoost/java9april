package org.example.httpstuff;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CallApis {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .GET()
                .build();
        httpRequest = null;
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            // maak json van string
            JSONArray jsonArray = new JSONArray(response.body()); // voor lijsten []
           // JSONObject jsonObject = new JSONObject(response.body()); // voor single objecten {}
            System.out.println(jsonArray.getJSONObject(0).get("name"));

            //System.out.println(response.body());
            System.out.println("----------------");
            System.out.println(response.statusCode());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
