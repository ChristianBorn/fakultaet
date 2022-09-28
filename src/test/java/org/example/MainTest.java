package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void fakultaet0 () {
        // Given
        int number = 0;
        // When
        int actual = Main.calculateFakultaet(number);
        // Then
        int expectation = 1;
        assertEquals(expectation, actual);
    }
    @Test
    public void fakultaet1 () {
        // Given
        int number = 1;
        // When
        int actual = Main.calculateFakultaet(number);
        // Then
        int expectation = 1;
        assertEquals(expectation, actual);
    }
    @Test
    public void fakultaet2 () {
        // Given
        int number = 2;
        // When
        int actual = Main.calculateFakultaet(number);
        // Then
        int expectation = 2;
        assertEquals(expectation, actual);
    }
    @Test
    public void fakultaet3 () {
        // Given
        int number = 3;
        // When
        int actual = Main.calculateFakultaet(number);
        // Then
        int expectation = 6;
        assertEquals(expectation, actual);
    }
}