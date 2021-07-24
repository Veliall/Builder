package ru.netology;

/**
 * @author Igor Khristiuk
 */
public class PersonBuilder {

    private String firstName;
    private String lastName;
    private int age = -1;
    private String address;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Incorrect age");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (firstName == null || lastName == null) {
            throw new IllegalStateException("Please enter your first name and last name");
        }
        if (age == -1) {
            throw new IllegalStateException("Please enter your age");
        }
        return new Person(firstName, lastName, age, address);
    }
}
