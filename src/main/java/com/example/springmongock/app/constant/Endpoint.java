package com.example.springmongock.app.constant;

public class Endpoint {

    private Endpoint() {
        throw new IllegalStateException("Endpoint class");
    }

    // Config endpoint
    public static final String APP_CONFIG_ENDPOINT = "/v1/app-configs";
}
