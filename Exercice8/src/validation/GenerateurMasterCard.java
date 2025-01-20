package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;
import domaine.DinersClub;
import domaine.MasterCard;
import java.util.Calendar;

public class GenerateurMasterCard extends Generateur{

  public GenerateurMasterCard(Generateur successeur) {
    super(successeur);
  }

  @Override
  public boolean valider(String numero) {
    if (numero.startsWith("51") || numero.startsWith("52") ||
    numero.startsWith("53") || numero.startsWith("54") || numero.startsWith("55")
        && numero.length() == 16){
      return true;
    }
    return false;
  }

  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    if (valider(numero)){
      return new MasterCard(numero,dateExpiration,nom);
    }
    return super.creerCarte(numero,dateExpiration,nom);
  }
}
