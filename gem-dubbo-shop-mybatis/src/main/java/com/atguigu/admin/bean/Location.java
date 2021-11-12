package com.atguigu.admin.bean;

import java.io.Serializable;
import java.util.List;

public class Location implements Serializable {
    private Integer id;
    private String country;

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    private List<Score> scores;

    public Location(Integer id, String country) {
        this.id = id;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", scores=" + scores +
                '}';
    }

    public Location() {
    }
}
