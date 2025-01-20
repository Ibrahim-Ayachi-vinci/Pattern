package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;
import domaine.DinersClub;
import domaine.Discover;
import java.util.Calendar;

public class GenerateurDiscover extends Generateur{

  public GenerateurDiscover(Generateur successeur) {
    super(successeur);
  }

  @Override
  public boolean valider(String numero) {
    if (numero.startsWith("6011") || numero.startsWith("65") && numero.length() == 16){
      return true;
    }
    return false;
  }

  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    if (valider(numero)){
      return new Discover(numero,dateExpiration,nom);
    }
    return super.creerCarte(numero,dateExpiration,nom);
  }
}
