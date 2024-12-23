package com.nihal;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String familyName;
    private LocalDate birthDate;
    private String address;

    public Person(String firstName, String familyName, LocalDate birthDate, String address) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getfamilyName() {
        return familyName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public int calculateAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    // Redéfinition de equals et hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                familyName.equals(person.familyName) &&
                birthDate.equals(person.birthDate) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, familyName, birthDate, address);
    }

    @Override
    public String toString() {
        return String.format("Person{firstName='%s', familyName='%s', birthDate=%s, address='%s'}",
                firstName, familyName, birthDate, address);
    }

  
}