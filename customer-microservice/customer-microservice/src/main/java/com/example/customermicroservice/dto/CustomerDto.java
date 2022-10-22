package com.example.customermicroservice.dto;

public class CustomerDto {
    private String name;
    private String email;

    public CustomerDto() {}

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
