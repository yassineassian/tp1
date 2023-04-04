package ex4;

import java.util.Arrays;

public class Personne {
    private String nom;
    private Compte[] comptes;

    public Personne() {
        this.nom="";
        this.comptes=new Compte[0];
    }

    public Personne(String nom) {
        this.nom = nom;
        this.comptes=new Compte[0];
    }

    public Personne(String nom, Compte[] comptes) {
        this.nom = nom;
        this.comptes = comptes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }

    public Compte getCompte(int num){
        for (Compte compte : this.comptes) {
            if (compte.getNum() == num) return compte;
        }
        return null;
    }

    public void setCompte(int num, Compte compteP){
        for (int i=0;i<this.comptes.length;i++) {
            if (this.comptes[i].getNum() == num) this.comptes[i]=compteP;
        }
    }

    public void ajouterCompte(int num, int solde){
        Compte[] compte1 = new Compte[this.comptes.length+1];
        System.arraycopy(this.comptes, 0, compte1, 0, this.comptes.length);
        compte1[compte1.length-1]=new Compte(num,solde);
        this.comptes=compte1;
    }

    public void supprimerCompte(int num){
        Compte[] compte1 = new Compte[this.comptes.length-1];
        for(int i=0,j=0;i<this.comptes.length;i++){
            if(this.comptes[i].getNum()!=num){
                compte1[j]=this.comptes[i];
                j++;
            }
        }
        this.comptes=compte1;
    }

    public void deposer(int num, int argent){
        Compte compte = getCompte(num);
        compte.crediter(argent);
        setCompte(num,compte);
    }

    public void retirer(int num, int argent){
        Compte compte = getCompte(num);
        compte.debiter(argent);
        setCompte(num,compte);
    }

    public void virement(int srcNum, int destNum, int argent){
        Compte srcCompte = getCompte(srcNum);
        Compte destCompte = getCompte(destNum);
        int solde = srcCompte.getSolde();
        srcCompte.debiter(argent);
        if(srcCompte.getSolde()!=solde)destCompte.crediter(argent);
        else System.out.println("Transaction echoue");
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }
}
