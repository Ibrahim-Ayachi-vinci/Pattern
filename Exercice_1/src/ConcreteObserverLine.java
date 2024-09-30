public class ConcreteObserverLine implements Observer{
    int nbLines = 0;

    @Override
    public void treatLine(String line) {
        nbLines++;
    }

    @Override
    public void endOfFile() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Il y avait " + nbLines + " lignes.";
    }
}
