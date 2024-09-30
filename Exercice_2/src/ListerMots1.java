import java.io.*;
import java.util.*;

public class ListerMots1{ // mal foutu
  private String fichier;

  public ListerMots1(String fichier) {
    this.fichier = fichier;
  }

  public void imprimer(Strategy s) throws IOException {
    BufferedReader input = new BufferedReader(new FileReader(this.fichier));
    String buffer = null;
    while ((buffer = input.readLine()) != null) {
      StringTokenizer mots = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
      while (mots.hasMoreTokens()) {
        String mot = mots.nextToken();
        if (s.estValide(mot))
          System.out.println(mot);
      }
    }
  }
}
