package turki.Model;


abstract public class Compte {
    protected String numero;
    protected float solde;
    protected String devise;
    protected Client titulaire;

    public Compte(String numero, float solde, String devise, Client titulaire) {
        super();
        this.numero = numero;
        this.solde = solde;
        this.devise = devise;
        this.titulaire = titulaire;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public float getSolde() {
        return solde;
    }
    public void setSolde(float solde) {
        this.solde = solde;
    }
    public String getDevise() {
        return devise;
    }
    public void setDevise(String devise) {
        this.devise = devise;
    }
    public Client getTitulaire() {
        return titulaire;
    }
    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    public void debiter(float montant)
    {
        solde=solde-montant;
    }
    public void crediter(float montant)
    {
        solde=solde+montant;
    }
    public String decrire()
    {
        return "n� : "+numero+" - solde : "+solde+" "+devise;
    }



}
