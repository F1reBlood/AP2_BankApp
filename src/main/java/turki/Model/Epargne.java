package turki.Model;




public class Epargne extends Compte {
    private float interet;

    public Epargne(String numero, float solde, String devise, Client titulaire, float interet) {
        super(numero, solde, devise, titulaire);
        this.interet = interet;
    }

    public float getInteret() {
        return interet;
    }

    public void setInteret(float interet) {
        this.interet = interet;
    }

    public String decrire() {
        return super.decrire() + " - taux = " + (interet*100) +"%";
    }

    public void ajouter_interet()
    {
        super.solde = super.solde + super.solde*interet;
        //super.crediter(super.solde*interet);
    }

    public void debiter(float montant)
    {
        if(montant>(super.solde/2))
        {
            System.out.println("erreur, impossible de retirer + de la moiti� du solde");
        }
        else
        {
            super.debiter(montant);
        }
    }


}
