package turki.Model;

import java.sql.Date;
import java.util.ArrayList;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private int genre;
    private Date dateN;
    private String adresse;
    private String tel;
    private String email;
    private ArrayList<Compte> lstcompte;
    public Client(int id, String nom, String prenom, int genre, Date dateN, String adresse, String tel,
                  String email, ArrayList<Compte> lstcompte) {
        super();
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.dateN = dateN;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.lstcompte = lstcompte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getGenre() {
        return genre;
    }
    public void setGenre(int genre) {
        this.genre = genre;
    }
    public Date getDateN() {
        return dateN;
    }
    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Compte> getLstcompte() {
        return lstcompte;
    }
    public void setLstcompte(ArrayList<Compte> lstcompte) {
        this.lstcompte = lstcompte;
    }
    public void info_comptes()
    {
        String g;
        if(genre==1)
            g="M.";
        else
            g="Mme";
        System.out.println("Liste des comptes de "+g+" "+nom+" "+ prenom);
        for (Compte c : lstcompte)
        {
            System.out.println(c.decrire());
        }
    }


}
