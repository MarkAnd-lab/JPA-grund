package se.lexicon.mark.JPAgrund;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppUserDaoTest {

    AppUser testObject = null;
    int userId = 1;
    String firstName = "Mark";
    String lastName = "Andersson";
    String email = "mark-andersson@hotmail.com";
    LocalDate birthDate = LocalDate.ofEpochDay(1974_03_23);
    boolean active = true;
    String password = "1234";

    @BeforeEach
    void setUp(){
        testObject = new AppUser(userId,firstName,lastName,email,birthDate,active,password);
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