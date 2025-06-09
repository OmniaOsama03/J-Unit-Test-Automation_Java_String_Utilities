package org.example.test;

import static org.junit.Assert.*;

import org.example.TextUtils;
import org.junit.Test;

public class TextUtilsTestGraph {
    // Node Coverage Tests (Table 8)
    @Test
    public void testNullInput_NodeCoverage() {
        // Path P1, TC1: s = null → false
        assertFalse(TextUtils.isPalindrome(null));
    }

    @Test
    public void testPalindromeWithCaseConversion_NodeCoverage() {
        // Path P2, TC2: s = "BoB" → true
        assertTrue(TextUtils.isPalindrome("BoB"));
    }

    @Test
    public void testNonPalindrome_NodeCoverage() {
        // Path P3, TC3: s = "a B" → false
        assertFalse(TextUtils.isPalindrome("a B"));
    }
    //===============================
    // Edge Coverage Tests (Table 9)
    //===============================
    
    @Test
    public void testNullInput_EdgeCoverage() {
        // Path P1, TC1: s = null → false
        assertFalse(TextUtils.isPalindrome(null));
    }
 
    @Test
    public void testValidPalindrome_EdgeCoverage() {
        // Path P2, TC2: "BoB" → true
        assertTrue(TextUtils.isPalindrome("BoB"));
    }
  
    @Test
    public void testMixedCaseWithSpace_EdgeCoverage() {
        // Path P3, TC3: "a B" → false
        assertFalse(TextUtils.isPalindrome("a B"));
    }


    // Node Coverage Tests (Table 10)
    
    @Test
    public void testNullInput_CountVowels_NodeCoverage() {
        // Path P1, TC1: s = null
        assertEquals(0, TextUtils.countVowels(null));
    }
    @Test
    public void testShortInput_CountVowels_NodeCoverage() {
        // Path P2, TC2: s = "is"
        assertEquals(1, TextUtils.countVowels("is"));
    }

    //===============================
    // Edge Coverage Tests
    //===============================

    @Test
    public void testNullInput_CountVowels_EdgeCoverage() {
        // Path P1, TC1: s = null
        assertEquals(0, TextUtils.countVowels(null));
    }

    @Test
    public void testShortInput_CountVowels_EdgeCoverage() {
        // Path P2, TC2: s = "is"
        assertEquals(1, TextUtils.countVowels("is"));
    }
}
