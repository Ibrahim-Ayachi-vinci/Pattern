import java.util.HashSet;
import java.util.Set;

public class ConcreteObserverPalindrome implements Observer{

    int nbPalindrome = 0;
    Set<String> blacklisted = new HashSet<>();
    @Override
    public void treatLine(String line) {
        String[] words = line.replaceAll("\\p{Punct}", "").split(" ");
        for (String word : words){
            StringBuffer reversedWord = new StringBuffer(word).reverse();
            if (!blacklisted.contains(word) && reversedWord.toString().equals(word)){
                nbPalindrome++;
                blacklisted.add(word);
            }
        }
    }

    @Override
    public void endOfFile() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Il y avait " + nbPalindrome + " palindromes.";
    }
}
