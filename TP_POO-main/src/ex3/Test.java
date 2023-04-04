package ex3;

public class Test {
    public static void main(String[] args) {
        Angle angle = new Angle(60);

        //Test set 1
        System.out.println(angle);
        angle.sous(850);
        System.out.println(angle);
        angle.mul(5);
        System.out.println(angle);
        angle.add(50);
        System.out.println(angle);

        System.out.println("========================================");

        //Test set 2
        System.out.println("Expected "+Math.PI/3);
        System.out.println("Found "+angle.rad());

        System.out.println("Expected "+Math.sin(Math.PI/3));
        System.out.println("Found "+angle.sin());

        System.out.println("Expected "+Math.tan(Math.PI/3));
        System.out.println("Found "+angle.tan());
    }
}