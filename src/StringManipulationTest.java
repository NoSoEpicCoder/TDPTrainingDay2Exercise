import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {
    String[] stringArray = new String[5];

    @org.junit.jupiter.api.Test
    void reverseString() {
        assertEquals("gnirts a esreveR", StringManipulation.reverseString("Reverse a string"));
        assertEquals("olleh", StringManipulation.reverseString("hello"));
        assertEquals("4321 gnitset", StringManipulation.reverseString("testing 1234"));
    }

    @org.junit.jupiter.api.Test
    void isEqual() {
        assertFalse(StringManipulation.isEqual("Hello World", "Hello world"));
        assertTrue(StringManipulation.isEqual("Test", "Test"));
        assertFalse(StringManipulation.isEqual("this is", "the same"));
    }

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        assertTrue(StringManipulation.isPalindrome("radar"));
        assertTrue(StringManipulation.isPalindrome("racecar"));
        assertFalse(StringManipulation.isPalindrome("negative"));
    }

    @org.junit.jupiter.api.Test
    void mySplitChar() {
    }

    @org.junit.jupiter.api.Test
    void mySplitString() {
    }
}