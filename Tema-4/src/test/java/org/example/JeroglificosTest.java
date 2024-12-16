package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeroglificosTest {

    @Test
    void casoDePrueba() {
        assertAll(
                () -> assertEquals("CC", Jeroglificos.convertir(200)),
                () -> assertEquals("GT", Jeroglificos.convertir(11)),
                () -> assertEquals("FCCCCCCCCCGGGGGGGGGTT", Jeroglificos.convertir(1992))
        );
    }
}