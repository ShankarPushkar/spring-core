package com.stackroute.spring.domain;

public class Surveyor {
    private int id;
    private String name;


    public Surveyor() {
    }

    public Surveyor(String name, int id) {
        this.name = name;
        this.id = id;
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

    @Override
    public String toString() {
        return "Surveyor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
