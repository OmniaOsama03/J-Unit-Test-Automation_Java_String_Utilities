package org.example.test;

import static org.junit.Assert.*;

import org.example.TextUtils;
import org.junit.Test;

public class TextUtilsTest {

	 // countVowels tests
    @Test
    public void testCountVowels_noVowelsAllLowercase() {
        assertEquals(0, TextUtils.countVowels("bcdfg"));
    }

    @Test
    public void testCountVowels_allVowelsUppercase() {
        assertEquals(5, TextUtils.countVowels("AEIOU"));
    }

    @Test
    public void testCountVowels_mixedVowelsMixedCase() {
        assertEquals(4, TextUtils.countVowels("AbEcIdO"));
    }

    // removePunctuation tests
    @Test
    public void testRemovePunctuation_onlyPunctuationManyMarks() {
        assertEquals("", TextUtils.removePunctuation("!@#$%"));
    }

    @Test
    public void testRemovePunctuation_punctuationAndLetters() {
        assertEquals("Hello world", TextUtils.removePunctuation("Hello, world!"));
    }

    @Test
    public void testRemovePunctuation_onlyLettersNoPunctuation() {
        assertEquals("Hello World", TextUtils.removePunctuation("Hello World"));
    }

    // isPalindrome tests
    @Test
    public void testIsPalindrome_lowercasePalindrome() {
        assertEquals(true, TextUtils.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindrome_uppercaseNotPalindrome() {
        assertEquals(false, TextUtils.isPalindrome("HELLO"));
    }

    @Test
    public void testIsPalindrome_mixedCasePalindrome() {
        assertEquals(true, TextUtils.isPalindrome("RaceCar"));
    }
}
