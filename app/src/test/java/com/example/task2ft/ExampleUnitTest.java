package com.example.task2ft;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleUnitTest {

    @Test
    public void counteElements_Returns_Correct_Count() {
        String input = "Mokausi FinTech!";
        int expectedCount = 16; // Including the space and punctuation
        int actualCount = TxtCounter.countLetters(input);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countWords_Returns_Correct_Count() {
        String input = "Mokausi FinTech!";
        int expectedCount = 2;
        int actualCount = TxtCounter.countWords(input);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countWords_With_Empty_Input_Returns_Zero() {
        String input = "";
        int expectedCount = 0;
        int actualCount = TxtCounter.countWords(input);
        assertEquals(expectedCount, actualCount);
    }
    @Test
    public void countElements_With_Empty_Input_Returns_Zero() {
        String input = "";
        int expectedCount = 0;
        int actualCount = TxtCounter.countLetters(input);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countLElements_With_Numbers_N_Symbols_Returns_Correct_Count() {
        String input = "1234567890<>?:\"|{}_+";
        int expectedCount = 20;
        int actualCount = TxtCounter.countLetters(input);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countElements_Only_Spaces_Returns_Correct_Count() {
        String input = "   ";
        int expectedCount = 3;
        int actualCount = TxtCounter.countLetters(input);
        assertEquals(expectedCount, actualCount);
    }
    @Test
    public void countElemets_With_Punctuation_Marks_Returns_Correct_Count() {
        String input = "Hello, World!??";
        int expectedCount = 15;
        int actualCount = TxtCounter.countLetters(input);
        assertEquals(expectedCount, actualCount);
    }
    @Test
    public void countElements_One_Letter_Returns_One() {
        String input = "a";
        int expectedCount = 1;
        int actualCount = TxtCounter.countLetters(input);
        assertEquals(expectedCount, actualCount);
    }
    @Test
    public void countWords_With_Special_Characters_ReturnsCorrectCount() {
        String input = "Hello, World!??";
        int expectedCount = 2;
        int actualCount = TxtCounter.countWords(input);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countWords_With_Numbers_And_Symbols_ReturnsCorrectCount() {
        String input = "Hello, World!??1234";
        int expectedCount = 2;
        int actualCount = TxtCounter.countWords(input);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countWords_With_Only_Numbers_N_Symbols_ReturnsZero() {
        String input = "!@#$%^&*()1234567890";
        int expectedCount = 0;
        int actualCount = TxtCounter.countWords(input);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countWords_With_Only_Spaces_ReturnsZero() {
        String input = "          ";
        int expectedCount = 0;
        int actualCount = TxtCounter.countWords(input);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countWords_WithOneLetter_ReturnsOne() {
        String input = "a";
        int expectedCount = 1;
        int actualCount = TxtCounter.countWords(input);
        assertEquals(expectedCount, actualCount);
    }
}
