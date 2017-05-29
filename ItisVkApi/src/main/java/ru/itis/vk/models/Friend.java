package ru.itis.vk.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Friend {
    @JsonProperty("user_id")
    private int userId;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    private int sex;
    private String domain;
    @JsonProperty("photo_200_orig")
    private String photo;
    private int online;

    public Friend() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public String toString() {
        return this.userId + " " +
                this.firstName + " " +
                this.lastName + " " +
                this.sex + " " +
                this.online + " " +
                this.domain + " " +
                this.photo;
    }
}
