import org.junit.jupiter.api.Test;

public class SymbolCount {

    @Test
    public void mortgageCalculations() {
        String randomString = "Hello World is me Vladimir";
        int numberOfSymbolsInAString = randomString.length();
        String trim = randomString.trim();
        int wordsCount = trim.split("\\s").length;


        System.out.println("- The number of symbols in the string is: " + numberOfSymbolsInAString + "\n"
                + "- The total number of the words in the string is: " +
                wordsCount);


    }
}
