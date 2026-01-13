package turki.Model;



public class Courant extends Compte{
    private int CB;
    private float decouvert;
    public Courant(String numero, float solde, String devise, Client titulaire, int cB, float decouvert) {
        super(numero, solde, devise, titulaire);
        CB = cB;
        this.decouvert = decouvert;
    }
    public int getCB() {
        return CB;
    }
    public void setCB(int cB) {
        CB = cB;
    }
    public float getDecouvert() {
        return decouvert;
    }
    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }
    public void debiter(float montant)
    {
        if (super.solde-montant < -decouvert)
        {
            System.out.println("erreur decouvert max atteint");
        }
        else
        {
            super.solde=super.solde-montant;
        }
    }
}
