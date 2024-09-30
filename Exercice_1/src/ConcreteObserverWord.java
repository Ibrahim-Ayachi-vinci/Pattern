public class ConcreteObserverWord implements Observer {
    int nbWords = 0;


    @Override
    public void treatLine(String line) {
        String[] words = line.replaceAll("\\p{Punct}", "").split(" ");
        nbWords = nbWords+words.length;
    }

    @Override
    public void endOfFile() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Il y avait " + nbWords + " mots.";
    }
}
