package com.sda.springdemojavaee14.homework.annotation;

import java.util.Objects;

public class PersonWithAllSourceCode {

    private String name;

    private String surname;

    private int age;

    // every class have default constructor - empty argument list, it just assigns default values to all fields
    public PersonWithAllSourceCode() {}

    // If I add some custom constructor, default one is gone, so I need to add it again
    public PersonWithAllSourceCode(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonWithAllSourceCode{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    // If You provide equals method always add hashCode too
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonWithAllSourceCode that = (PersonWithAllSourceCode) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    // It's necessary into collections
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
