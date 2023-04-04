package ex2;

public class Test {
    public static void main(String[] args) {
        //1.
        De de = new De(6);
        int A=0,B=0;
        for(int i=0;i<10;i++){
            //==ieme tour==
            A+= de.hasard();
            B+= de.hasard();
            //=============
        }
        if(A>B)System.out.println("A est le gagnant (score="+A+")");
        else if(A<B)System.out.println("B est le gagnant (score="+B+")");
        else System.out.println("Egalite (score="+A+")");

        //2.
        A=0;
        B=0;
        for(int i=0;i<10;i++){
            //==ieme tour==
            A+= de.hasard();
            B+= de.hasard();
            if(A>=21||B>=21)break;
            //=============
        }
        if(A>B)System.out.println("A est le gagnant (score="+A+")");
        else if(A<B)System.out.println("B est le gagnant (score="+B+")");
        else System.out.println("Egalite (score="+A+")");

    }
}