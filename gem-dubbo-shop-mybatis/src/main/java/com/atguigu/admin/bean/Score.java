package com.atguigu.admin.bean;


import java.io.Serializable;

public class Score implements Serializable {
    private Integer id;
    private String name;
    private String subject;
    private Integer score;

    private Location location;
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public Score(Integer id, String name, String subject, Integer score) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public Score() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                ", location=" + location +
                '}';
    }
}
