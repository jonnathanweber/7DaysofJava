package java7days.java;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class APIClient {
	
	String api;
	
	public APIClient(String api) {
		this.api = api;
	}
	
	public String coletaJSON() {
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
        	uri(URI.create(this.api)).
        	build();
        return (String) client.sendAsync(request, BodyHandlers.ofString()).
        	thenApply(HttpResponse::body).
    		join();
	}

}
