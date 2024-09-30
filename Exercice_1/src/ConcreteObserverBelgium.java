import java.util.List;

public class ConcreteObserverBelgium implements Observer{
    int nbBelgium = 0;


    @Override
    public void treatLine(String line) {
        if(line.contains("Belgique")){
            nbBelgium++;
        }

    }

    @Override
    public void endOfFile() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Il y avait " + nbBelgium + " lignes contenant Belgique.";
    }
}
