package org.example;

public class MyService {
    public final ExternalApi api;
    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData(){
        return api.getData();
    };

}
