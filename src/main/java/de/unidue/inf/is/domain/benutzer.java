package de.unidue.inf.is.domain;

public class Benutzer {
    private int id;
    private  String name;
    private  String Email;

    public Benutzer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        Email = email;
    }
    public Benutzer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

