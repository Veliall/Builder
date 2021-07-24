package ru.netology;

import java.util.Objects;

/**
 * @author Igor Khristiuk
 */
public class Person {
    protected final String firstName;
    protected final String lastName;
    protected int age;
    protected String address;

    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public void happyBirthday() {
        age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setLastName(this.getLastName())
                .setAddress(this.getAddress());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name: " + firstName +
                ", Surname: " + lastName +
                ", Age: " + age +
                ", Address: " + address + "}";
    }

}
