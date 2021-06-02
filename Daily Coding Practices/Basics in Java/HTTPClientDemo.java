package com.fita;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;



public class HTTPClientDemo {

	public static void main(String[] args) {
		
		String uri = "https://postman-echo.com/get?usermane=cena&pwd=1234";
		
		HttpRequest req = HttpRequest.newBuilder()
                          .uri(URI.create(uri))
                        .GET()
                        .version(Version.HTTP_2)
                        .build();
		
		HttpClient cl = HttpClient.newBuilder()
				        .build();
		
		
		
		try {
			HttpResponse<String>	resp = cl.send(req, BodyHandlers.ofString());
			
			System.out.println(resp.statusCode());
			System.out.println(resp.body());
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				                    
                        
                        		              
	}

}
