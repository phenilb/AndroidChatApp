package com.ppbml.chatappshutup.Model;

public class User {

    private String id;
    private String username;
    private String imageURI;
    private String status;
    private String search;

    public User(String id, String username, String imageURI, String search) {
        this.id = id;
        this.username = username;
        this.imageURI = imageURI;
        this.status = status;
        this.search = search;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getImageURI() {
        return imageURI;
    }

    public void setImageURI(String imageURI) {
        this.imageURI = imageURI;
    }
}
