package com.atguigu.admin.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String classes;
    private Integer grade;

    public Student(Integer id, String name, Integer age, String classes, Integer grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
        this.grade = grade;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classes='" + classes + '\'' +
                ", grade=" + grade +
                '}';
    }
}
