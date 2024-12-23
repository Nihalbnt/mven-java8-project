package com.nihal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonService2 {

    public static List<Person> filterAdults() {
        List<Person> mockPersonsDatabase = Arrays.asList(
            new Person("Gaelle", "Garcia", LocalDate.of(1998, 10, 25), "123 Rue A"),
            new Person("Andie", "Ella", LocalDate.of(2003, 6, 1), "123 Rue A")
        );

        Predicate<Person> isAdult = person -> person.calculateAge() >= 18;

        return mockPersonsDatabase.stream().filter(isAdult).collect(Collectors.toList());
    }

    public static List<Person> getAdultsOver18() {
        return filterAdults();
    }
    
}