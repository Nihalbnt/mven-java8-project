package com.nihal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class PersonTest {

    @Test
    public void testEqualsAndHashCode() {
        // Given
        Person person1 = new Person(1, "Alice");
        Person person2 = new Person(1, "Alice");
        Person person3 = new Person(2, "Bob");

        // Test equals
        System.out.println("Running testEqualsAndHashCode");

        assertTrue(person1.equals(person2));  // Personnes avec mêmes ID et nom
        assertEquals(person1.hashCode(), person2.hashCode());  // Vérification du hashCode

        // Test inégalité
        assertTrue(!person1.equals(person3));  // Personnes avec ID différents
    }

    @Test
    public void testToString() {
        // Given
        Person person = new Person(1, "Alice");

        // Test toString
        System.out.println("Running testToString");

        String expectedToString = "Person{id=1, name='Alice'}";
        assertEquals(expectedToString, person.toString());
    }
}