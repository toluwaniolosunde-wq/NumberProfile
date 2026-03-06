import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NosProfileTest {

    @Test
    public void testEvenNumber() {
        assertTrue(NosProfile.isEven(8));
    }

    @Test
    public void testOddNumber() {
        assertFalse(NosProfile.isEven(7));
    }

    @Test
    public void testPrimeNumber() {
        assertTrue(NosProfile.isPrime(7));
    }

    @Test
    public void testCompositeNumber() {
        assertFalse(NosProfile.isPrime(9));
    }

    @Test
    public void testPerfectNumber() {
        assertTrue(NosProfile.isPerfect(6));
    }

    @Test
    public void testNotPerfectNumber() {
        assertFalse(NosProfile.isPerfect(10));
    }

    @Test
    public void testPerfectSquare() {
        assertTrue(NosProfile.isSquare(16));
    }

    @Test
    public void testNotSquare() {
        assertFalse(NosProfile.isSquare(15));
    }

    @Test
    public void testPerfectCube() {
        assertTrue(NosProfile.isCube(27));
    }

    @Test
    public void testNotCube() {
        assertFalse(NosProfile.isCube(18));
    }

    @Test
    public void testPalindrome() {
        assertTrue(NosProfile.isPalindrome(121));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(NosProfile.isPalindrome(123));
    }
}