package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;
import domaine.DinersClub;
import domaine.Visa;
import java.util.Calendar;

public class GenerateurVisa extends Generateur{

  public GenerateurVisa(Generateur successeur) {
    super(successeur);
  }

  @Override
  public boolean valider(String numero) {
    if (numero.startsWith("4") && numero.length() == 16){
      return true;
    }
    return false;
  }

  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    if (valider(numero)){
      return new Visa(numero,dateExpiration,nom);
    }
    return super.creerCarte(numero,dateExpiration,nom);
  }
}
