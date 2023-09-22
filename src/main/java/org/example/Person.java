package org.example;

import java.util.Objects;

public class Person {

    private final String name;
    private final String surname;
    private int age;
    private String adress;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAdress() {
        return adress != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAddress(String address) {
        this.adress = address;
    }

    public void happyBirthday() {
        age++;
        System.out.println("Поздравляем с днем рождления! Вы стали старше на 1 год!");
    }

    @Override
    public String toString() {
        return name + " " + surname + "(" + age + " год, живет в городе "+ adress+ ")";
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name + surname);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setName(name);
    }

}
