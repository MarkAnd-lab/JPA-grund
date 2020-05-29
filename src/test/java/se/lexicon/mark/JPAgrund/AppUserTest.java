package se.lexicon.mark.JPAgrund;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {
    AppUser testObject = null;
    int userId = 1;
    String firstName = "Mark";
    String lastName = "Andersson";
    String email = "mark-andersson@hotmail.com";
    LocalDate birthDate = LocalDate.ofEpochDay(1974_03_23);
    boolean active = true;
    String password = "1234";

    @BeforeEach
    void setUp() {
        testObject = new AppUser(userId, firstName, lastName, email, birthDate, active, password);
    }

    @Test
    void getUserId() {
        assertEquals(userId, testObject.getUserId());
    }

    @Test
    void getFirstName() {
        assertEquals(firstName, testObject.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals(lastName, testObject.getLastName());
    }

    @Test
    void getEmail() {
        assertEquals(email, testObject.getEmail());
    }

    @Test
    void getBirthDate() {
        assertEquals(birthDate, testObject.getBirthDate());
    }

    @Test
    void getPassword() {
        assertEquals(password, testObject.getPassword());
    }

    @Test
    void testEquals() {
        AppUser copy = new AppUser(userId, firstName, lastName, email, birthDate, active, password);

        assertTrue(testObject.equals(copy));
    }

    @Test
    void testHashCode() {
        AppUser copy = new AppUser(userId, firstName, lastName, email, birthDate, active, password);
        assertEquals(copy.hashCode(), testObject.hashCode());
    }

    @Test
    void testToString() {
        String toString = testObject.toString();

        assertTrue(toString.contains(String.valueOf(userId)));
        assertTrue(toString.contains(birthDate.toString()));
        assertTrue(toString.contains(password));
    }
}