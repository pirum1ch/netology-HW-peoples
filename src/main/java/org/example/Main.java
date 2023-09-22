package org.example;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        System.out.println("проверка что hasAge возвращает true при заполненном возрасте: " + mom.hasAge());
        System.out.println("проверка что hasAввкуыы возвращает true при заполненном адресе: " + mom.hasAdress());
        System.out.println("Текущий адрес мамы: " + mom.getAdress());
        mom.setAddress("Melbourne");
        System.out.println("Новый адрес мамы: " + mom.getAdress());

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}