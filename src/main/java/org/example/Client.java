package org.example;

public class Client {

    private String name;
    private boolean isRegistered;

    public Client(String name, boolean isRegistered) {
        this.name = name;
        this.isRegistered = isRegistered;
    }

    public String getName() {
        return name;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

}
