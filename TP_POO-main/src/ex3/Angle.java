package ex3;

public class Angle {
    private int deg;

    public Angle() {
        this.deg=0;
    }

    public Angle(int deg) {
        this.deg = deg;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public void add(int val){
        this.deg +=val;
        this.deg %=360;
    }

    public void sous(int val){
        this.deg-=val%360;
        if(this.deg<0)this.deg+=360;
    }

    public void mul(int val){
        this.deg*=val;
        this.deg%=360;
    }

    public double rad(){
        return ((double) this.deg/180)*Math.PI;
    }

    public double sin(){
        return Math.sin(rad());
    }

    public double cos(){
        return Math.cos(rad());
    }

    public double tan(){
        return Math.tan(rad());
    }

    @Override
    public String toString() {
        return "Angle{" +
                "deg=" + deg +
                '}';
    }
}
