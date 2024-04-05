package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class miniProject {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        String url = "https://jsonplaceholder.typicode.com/posts/1"; // Example URL

        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String responseData = response.body().string();
                System.out.println("Response Data:");
                System.out.println(responseData);
            } else {
                System.out.println("Error: " + response.code() + " - " + response.message());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
