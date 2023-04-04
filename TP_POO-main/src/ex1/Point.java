package ex1;

public class Point {
    private float cordx;
    private float cordy;
    private String couleur;
    private String nom;

    public Point() {
        this.cordx=0;
        this.cordy=0;
        this.couleur="indefinie";
        this.nom="";
    }

    public Point(float cordx, float cordy) {
        this.cordx = cordx;
        this.cordy = cordy;
    }

    public Point(float cordx, float cordy, String couleur, String nom) {
        this.cordx = cordx;
        this.cordy = cordy;
        this.couleur = couleur;
        this.nom = nom;
    }
    //pour que changerx et changery deviennent des setters il faut que cordx et cordy soient des attributs privées et donc
    //il faut aussi ajouter les getters
    public void changerx(float cordx) {
        this.cordx = cordx;
    }

    public void changery(float cordy) {
        this.cordy = cordy;
    }

    public void deplacerpoint(float decx, float decy){
        changerx(this.cordx+decx);
        changery(this.cordy+decy);
    }

    public void changercouleur(String couleur) {
        this.couleur = couleur;
    }

    public float getCordx() {
        return cordx;
    }

    public float getCordy() {
        return cordy;
    }

}
