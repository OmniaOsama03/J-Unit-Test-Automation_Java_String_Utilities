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

 // isPalindrome tests
    @Test
    public void testIsPalindrome_lowercasePalindrome() {
        assertTrue(TextUtils.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindrome_uppercaseNotPalindrome() {
        assertFalse(TextUtils.isPalindrome("HELLO"));
    }

    @Test
    public void testIsPalindrome_mixedCasePalindrome() {
        assertTrue(TextUtils.isPalindrome("RaceCar"));
    }

}
