package com.entity;

public class Dept {

    private int id;
    private String deptnese;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptnese() {
        return deptnese;
    }

    public void setDeptnese(String deptnese) {
        this.deptnese = deptnese;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptnese='" + deptnese + '\'' +
                '}';
    }
}
