package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;
import domaine.DinersClub;
import java.util.Calendar;

public class GenerateurDinersClub extends Generateur{

  public GenerateurDinersClub(Generateur successeur) {
    super(successeur);
  }

  @Override
  public boolean valider(String numero) {
    if (numero.startsWith("36") && numero.length() == 14){
      return true;
    }
    return false;
  }

  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    if (valider(numero)){
      return new DinersClub(numero,dateExpiration,nom);
    }
    return super.creerCarte(numero,dateExpiration,nom);
  }
}
