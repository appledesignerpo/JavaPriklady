package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Viac informacii ohladom jUnit testov na https://www.vogella.com/tutorials/JUnit/article.html

@DisplayName("Testy pre metody obdlznika")
class TestujObdlznik2 {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Testy na vypocet obvodu")
    public void testVypocitajObvod() {
        assertEquals(10, Obdlznik2.vypocitajObvod(2, 3), "vypocet obvodu by mal byt  10");
        assertEquals(13, Obdlznik2.vypocitajObvod(2.5, 4));
    }

    @Test
    @DisplayName("Testy na vypocet obsahu")
    public void testVypocitajObsah() {
        assertEquals(6, Obdlznik2.vypocitajObsah(2, 3));
        assertEquals(10, Obdlznik2.vypocitajObsah(2.5, 4));
        assertEquals(5, Obdlznik2.vypocitajObsah(1, 5));
    }
}