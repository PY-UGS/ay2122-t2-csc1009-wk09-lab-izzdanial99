import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomCharacterTest {
    private String testCharacter;
    private RandomCharacter randomChar = new RandomCharacter();
    private String abcList = "abcdefghijklmnopqrstuvwxyz";
    private String digits = "0123456789";

    @Test
    public void testLowerCaseLetter() {
        String value = randomChar.getRandomLowerCaseLetter();
        char value_char = value.charAt(0); // convert string to char
        assertTrue(Character.isLowerCase(value_char)); //check if it is lowercase
    }

    @Test
    public void testUpperCaseLetter() {
        String value = randomChar.getRandomUpperCaseLetter();
        char value_char = value.charAt(0); //convert string to char
        assertTrue(Character.isUpperCase(value_char)); //check if it is uppercase
    }

    @Test
    public void testDigit() {
        testCharacter = randomChar.getRandomDigitCharacter();
        assertTrue(digits.indexOf(testCharacter) != -1); // check if testCharacter is in digits
    }

    @Test
    public void testCharacter() {
        String allCharList = abcList + abcList.toUpperCase() + digits; // concat all the possible values
        testCharacter = randomChar.getRandomCharacter();
        assertTrue(allCharList.indexOf(testCharacter) != -1);
    }

    @Test
    public void testDigitPrime() {
        int testCharacter = Integer.parseInt(randomChar.getRandomDigitCharacter());
        boolean flag = false; //if it's a prime, flag will be true
        for (int i = 2; i <= testCharacter/2; i++) {
            if(testCharacter % i == 0) { // check if number is a prime
                flag = true;
                break;
            }
        }
        assertTrue(flag);
    }
}