package com.example.hw2cv;

public class CV {

    private String name;
    private int age;
    private String job;
    private int phone;
    private String email;


    public CV(String name, int age, String job, int phone, String email){

        this.name = name;
        this.age = age;
        this.job = job;
        this.phone = phone;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}