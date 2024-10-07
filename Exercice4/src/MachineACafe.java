public class MachineACafe {

	public enum State {
		IDLE {
         public void entrerMonnaie(Piece piece, MachineACafe machineACafe){
           machineACafe.etatCourant = State.COLLECTE;

         }

         public void selectionnerBoisson(ToucheBoisson boisson, MachineACafe machineACafe){
           machineACafe.afficherPasAssez(boisson);
           return;
         }

         public void rendreMonnaie(MachineACafe machineACafe){
           return;
         }

        }, COLLECTE{
      public void entrerMonnaie(Piece piece, MachineACafe machineACafe){
        return;
      }

      public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe){
        if (toucheBoisson.getPrix() > machineACafe.montantEnCours) {
          machineACafe.boisson = toucheBoisson;
          machineACafe.afficherPasAssez(machineACafe.boisson);
          machineACafe.boisson = toucheBoisson;
          machineACafe.etatCourant =  State.PAS_ASSEZ;
          return;
        }
        machineACafe.montantEnCours -= toucheBoisson.getPrix();
        machineACafe.afficherBoisson(toucheBoisson);
        machineACafe.afficherMontant();
        if (machineACafe.montantEnCours == 0)
        machineACafe.etatCourant = State.IDLE;
        else {
          machineACafe.etatCourant = State.COLLECTE;
        }
      }

      public void rendreMonnaie(MachineACafe machineACafe){
        machineACafe.afficherRetour();
        machineACafe.montantEnCours = 0;
        machineACafe.boisson = null;
        machineACafe.etatCourant = State.IDLE;

      }

    }, PAS_ASSEZ{
			public void entrerMonnaie(Piece piece, MachineACafe machineACafe){
        if (machineACafe.boisson.getPrix() > machineACafe.montantEnCours) {
          machineACafe.afficherPasAssez(machineACafe.boisson);
        }else {
          machineACafe.montantEnCours -= machineACafe.boisson.getPrix();
          machineACafe.afficherBoisson(machineACafe.boisson);
          machineACafe.boisson = null;
          machineACafe.afficherMontant();
          if (machineACafe.montantEnCours == 0) {
            machineACafe.etatCourant = State.IDLE;
          }
          else {
            machineACafe.etatCourant = State.COLLECTE;
          }
        }
			}

      public void selectionnerBoisson(ToucheBoisson boisson, MachineACafe machineACafe){
        throw new IllegalStateException("Pas assez d'argent");
      }

      public void rendreMonnaie(MachineACafe machineACafe){
        machineACafe.afficherRetour();
        machineACafe.montantEnCours = 0;
        machineACafe.boisson = null;
        machineACafe.etatCourant = State.IDLE;
      }

		};

    public void entrerMonnaie(Piece piece, MachineACafe machineACafe){}
    public void selectionnerBoisson (ToucheBoisson toucheBoisson, MachineACafe machineACafe){}

    public void rendreMonnaie(MachineACafe machineACafe) {}

    }
	
	private int montantEnCours = 0;
	private State etatCourant = State.IDLE;
	private ToucheBoisson boisson = null;
	
	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}
	
	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}
	
	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
		
	}

	public void entrerMonnaie(Piece piece) {
    montantEnCours += piece.getValeur();
    afficherMontant();
    etatCourant.entrerMonnaie(piece, this);

	}
	
	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
    etatCourant.selectionnerBoisson(toucheBoisson, this);
  }
	
	public void rendreMonnaie() {
    etatCourant.rendreMonnaie(this);
  }
}
