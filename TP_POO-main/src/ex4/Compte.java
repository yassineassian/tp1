package ex4;

public class Compte {
    private int num;
    private int solde;

    public Compte() {
        this.num = 0;
        this.solde = 0;
    }

    public Compte(int num, int solde) {
        this.num = num;
        this.solde = solde;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void crediter(int montant){
        this.solde+=montant;
    }

    public void debiter(int montant){
        if(this.solde>=montant)this.solde-=montant;
        else System.out.println("Solde Insuffisant !");
    }

    @Override
    public String toString() {
        return "Compte{" +
                "num=" + num +
                ", solde=" + solde +
                '}';
    }
}
