package de.unidue.inf.is.domain;

public class transportmittel {

    private int id;
    private String name;
    private String icon;

    public transportmittel(int id, String name, String icon) {
        this.id = id;
        this.name = name;
        this.icon = icon;
    }
    public transportmittel(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
