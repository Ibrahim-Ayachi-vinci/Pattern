import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalyseurDeTexte {
    private List<Observer> observerCollection = new ArrayList<Observer>();

    public void readFile() throws IOException {

        BufferedReader lecteurAvecBuffer = null;
        String ligne;

        try {
            lecteurAvecBuffer = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Erreur d'ouverture");
        }
        if (lecteurAvecBuffer != null) {
            while ((ligne = lecteurAvecBuffer.readLine()) != null) {

                for (Observer observer : observerCollection) {
                    observer.treatLine(ligne);
                }
            }

            for (Observer observer : observerCollection) {
                observer.endOfFile();
            }
            lecteurAvecBuffer.close();
        }

    }

    public void addObserver(Observer observer) {
        observerCollection.add(observer);
    }

}
