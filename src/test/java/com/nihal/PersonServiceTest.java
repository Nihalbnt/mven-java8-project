package com.nihal;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PersonServiceTest {

    @Test
    public void testFilterByAddress() {
        List<Person> expectedPeople = Arrays.asList(
                new Person("Gaelle", "Garcia", LocalDate.of(1998, 10, 25), "123 Rue A"),
                new Person("Andie", "Ella", LocalDate.of(2003, 6, 1), "123 Rue A"));
        List<Person> actualPeople = PersonService.filterByAddress("123 Rue A");
        assertThat(actualPeople).containsExactlyInAnyOrderElementsOf(expectedPeople);
    }

    @Test
    public void testFilterAdults() {
        List<Person> expectedAdults = Arrays.asList(
                new Person("Gaelle", "Garcia", LocalDate.of(1998, 10, 25), "123 Rue A"),
                new Person("Andie", "Ella", LocalDate.of(2003, 6, 1), "123 Rue A"));
        List<Person> actualAdults = PersonService.filterAdults();
        assertThat(actualAdults).containsExactlyInAnyOrderElementsOf(expectedAdults);
    }
}