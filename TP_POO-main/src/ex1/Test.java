package ex1;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1,3);
        //System.out.println("( "+point.cordx+" , "+point.cordy+" )");
        System.out.println("( "+point.getCordx()+" , "+point.getCordy()+" )");
        point.deplacerpoint(4,4);
        //System.out.println("( "+point.cordx+" , "+point.cordy+" )");
        System.out.println("( "+point.getCordx()+" , "+point.getCordy()+" )");
    }
}