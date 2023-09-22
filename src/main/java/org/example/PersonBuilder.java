package org.example;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surName) {
        this.surname = surName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Возраст должен быть больше 0!");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String adress) {
        this.address = adress;
        return this;
    }

    public Person build() {
        if (name == null || surname == null)
            throw new IllegalStateException("Вы не заполнили минимально необходимые поля для создания объекта");
        return new Person(name, surname, age, address);
    }
}
