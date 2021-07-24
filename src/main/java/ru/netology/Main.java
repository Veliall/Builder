package ru.netology;

/**
 * @author Igor Khristiuk
 */
public class Main {

    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setFirstName("Анна")
                .setLastName("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setFirstName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обязательных полей
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

        try {
            // Не указан возраст
            new PersonBuilder().setFirstName("1").setLastName("2").build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        //Проверяем методы hasAge, hasAddress.
        // Билдер не даст создать без возраста в данном исполнении, поэтому создаём напрямую.
        Person person = new Person("Name", "Surname");
        System.out.println(person.hasAge() + ", " + person.hasAddress());

    }
}
