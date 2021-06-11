package com.example.recyclerview;


public class Friends {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Friends(String name, String age) {
        this.name = name;
        this.age = age;
    }

    String name;
    String age;

    @Override
    public String toString() {
        return "Friends{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

