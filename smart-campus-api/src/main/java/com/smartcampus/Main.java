package com.smartcampus;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;

import java.net.URI;

public class Main {

    public static final String BASE_URI = "http://localhost:8080/";

    public static HttpServer startServer() {
        final AppConfig config = new AppConfig();
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), config);
    }

    public static void main(String[] args) {
        final HttpServer server = startServer();

        System.out.println("=================================");
        System.out.println("🚀 Server started successfully!");
        System.out.println("📍 Base URL: " + BASE_URI + "api/v1");
        System.out.println("=================================");

        System.out.println("Press ENTER to stop the server...");

        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        server.shutdownNow();
        System.out.println("🛑 Server stopped.");
    }
}