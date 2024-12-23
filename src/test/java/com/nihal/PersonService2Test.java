package com.nihal;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonService2Test {

    public static List<Person> findPeopleAtAddress(String address) {
        List<Person> mockPersonsDatabase = Arrays.asList(
                new Person("Gaelle", "Garcia", LocalDate.of(1998, 10, 25), "123 Rue A"),
                new Person("Andie", "Ella", LocalDate.of(2003, 6, 1), "123 Rue A"),
                new Person("Lena", "Mahfouf", LocalDate.of(2001, 3, 20), "123 Rue C"));

        // Correction de l'import de Predicate et du code associé
        Predicate<Person> hasAddress = person -> person.getAddress().equals(address);
        return mockPersonsDatabase.stream().filter(hasAddress).collect(Collectors.toList());
    }

    @Test
    public void testFilterByAddress() {
        // Liste des personnes filtrées vivant à "123 Rue A"
        List<Person> peopleAt123RueA = PersonService.filterByAddress("123 Rue A");

        List<Person> expectedPeopleAt123RueA = Arrays.asList(
                new Person("Gaelle", "Garcia", LocalDate.of(1998, 10, 25), "123 Rue A"),
                new Person("Andie", "Ella", LocalDate.of(2003, 6, 1), "123 Rue A")
                );

        assertThat(peopleAt123RueA).containsExactlyElementsOf(expectedPeopleAt123RueA);
    }

    @Test
    public void testGetAdultsOver18() {
        List<Person> adultsOver18 = PersonService2.getAdultsOver18();
        List<Person> expectedAdultPersons = Arrays.asList(
                new Person("Gaelle", "Garcia", LocalDate.of(1998, 10, 25), "123 Rue A"),
                new Person("Andie", "Ella", LocalDate.of(2003, 6, 1), "123 Rue A")
                );
        assertThat(adultsOver18).containsExactlyElementsOf(expectedAdultPersons);
    }
}
