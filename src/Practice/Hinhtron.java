package Practice;

public class Hinhtron extends Hinhhoc {
    private double r;

    public Hinhtron() {
    }

    public Hinhtron(double r) {
        super();
        this.r = r;
    }

    public double getBankinh() {
        return r;
    }

    public void setBankinh(double r) {
        this.r = r;
    }

    public double dientichhinhtron() {
        double area = Math.PI * r * r;
        return area;
    }
}
