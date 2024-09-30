import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {


		Observer nbrMots = new ConcreteObserverWord();
		Observer nbrLignes = new ConcreteObserverLine() ;
		Observer nbrPalindromes = new ConcreteObserverPalindrome();
		Observer nbrBelgique = new ConcreteObserverBelgium() ;

		AnalyseurDeTexte subjectText = new AnalyseurDeTexte();
		subjectText.addObserver(nbrBelgique);
		subjectText.addObserver(nbrPalindromes);
		subjectText.addObserver(nbrLignes);
		subjectText.addObserver(nbrMots);

		subjectText.readFile();


	}
}
