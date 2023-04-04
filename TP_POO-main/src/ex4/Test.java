package ex4;

public class Test {
    public static void main(String[] args) {
        Personne personne = new Personne("Elyes");
        personne.ajouterCompte(1,200);
        personne.ajouterCompte(2,50);
        System.out.println(personne);

        personne.virement(1,2,300);
        personne.deposer(1,100);
        personne.virement(1,2,300);
        personne.retirer(2,200);
        System.out.println(personne);

        personne.supprimerCompte(1);
        System.out.println(personne);
    }
}