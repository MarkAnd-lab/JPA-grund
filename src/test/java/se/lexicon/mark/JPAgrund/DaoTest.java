package se.lexicon.mark.JPAgrund;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DaoTest {

    AppUser object = null;
    int userId = 1;
    String firstName = "Mark";
    String lastName = "Andersson";
    String email = "mark-andersson@hotmail.com";
    LocalDate birthDate = LocalDate.ofEpochDay(1974_03_23);
    boolean active = true;
    String password = "1234";

    @BeforeEach
    void setUp(){
        object = new AppUser(userId,firstName,lastName,email,birthDate,active,password);
    }

    @Test
    void findById() {
    }

    @Test
    void merge() {
    }

    @Test
    void persist() {
    }

    @Test
    void delete() {
    }
}