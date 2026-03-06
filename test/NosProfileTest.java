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
    public void testNotPrimeNumber() {
        assertFalse(NosProfile.isPrime(4));
    }


    @Test
    void testCompositeNumber() {
        assertTrue(NosProfile.isComposite(8));
    }

    @Test
    void testNotCompositeNumber() {
        assertFalse(NosProfile.isComposite(7));
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
    @Test
    void testArmstrong() {
        assertTrue(NosProfile.isArmstrong(153));
    }
    @Test
    void testNotArmstrong() {
        assertFalse(NosProfile.isArmstrong(123));
    }

    @Test
    void testAbundant() {
        assertTrue(NosProfile.isAbundant(12));
    }

    @Test
    void testNotAbundant() {
        assertFalse(NosProfile.isAbundant(8));
    }
    @Test
    void testDeficient() {
        assertTrue(NosProfile.isDeficient(8));
    }

    @Test
    void testNotDeficient() {
        assertFalse(NosProfile.isDeficient(12));
    }
    @Test
    void testDigitalSum() {
        assertEquals(6, NosProfile.digitalSum(123));
    }
    @Test
    void testNotFibonacci() {
        assertFalse(NosProfile.isFibonacci(7));
    }
    @Test
    void testFibonacci() {
        assertTrue(NosProfile.isFibonacci(8));
    }

}