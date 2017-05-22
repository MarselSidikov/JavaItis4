package ru.itis.models;

import java.util.List;

public class CountriesResponse {
    private List<Country> response;

    public CountriesResponse() {
    }

    public List<Country> getResponse() {
        return response;
    }

    public void setResponse(List<Country> response) {
        this.response = response;
    }
}
