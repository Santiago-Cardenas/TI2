package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

public class Person {

    private String name,surname,gender,nationality,code,bd;
    private int age,height;
    private String FILE_NAME_DATA_CSV_PATH = "data/babynames.csv";

    public Person(String name, String surname, String gender, String bd, int age, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
       // this.nationality = nationality;
        this.bd = bd;
        this.age = age;
        this.height = height;
        setCode(UUID.randomUUID().toString());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
