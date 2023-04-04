package ex2;

import java.util.Random;

public class De {
    private int faces;


    public De() {
        this.faces = 6;
    }

    public De(int faces) {
        this.faces = faces;
    }

    public int getFaces() {
        return faces;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }

    public int hasard(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }

}
