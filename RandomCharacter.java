import java.util.*;
public class RandomCharacter{

    Random random = new Random();
    int n = random.nextInt(26);

    public String getRandomLowerCaseLetter()
    {
        char value = (char) (n + 97);
        //System.out.println(value);
        return Character.toString(value);
    }

    public String getRandomUpperCaseLetter()
    {
        char value = (char) (n + 65);
        //System.out.println(value);
        return Character.toString(value);
    }

    public String getRandomDigitCharacter()
    {
        int value = random.nextInt(10);
        //System.out.println(value);        
        return Integer.toString(value);
    }

    public String getRandomCharacter()
    {
    int choice = random.nextInt(0,3); //get random number to pick which case to run
    switch (choice)
    {
        case 0:
            return getRandomLowerCaseLetter();
        case 1:
            return getRandomUpperCaseLetter();
        case 2:
            return getRandomDigitCharacter();
        default:
            throw new IllegalStateException("Unexpected value: " + choice);
    }
    }




    public static void main(String[] args) {

        RandomCharacter randomChar = new RandomCharacter();
        int i;
        for(i=0;i<15;i++)
        {   System.out.println("--------------------------------------"+(i+1)+"--------------------------------------");
            System.out.println("Random Lower Case Letter: " + randomChar.getRandomLowerCaseLetter());
            System.out.println("Random Upper Case Letter: " + randomChar.getRandomUpperCaseLetter());
            System.out.println("Random Digit Character: " + randomChar.getRandomDigitCharacter());
            System.out.println("Random Character: " + randomChar.getRandomCharacter());
        }
    }
    
}