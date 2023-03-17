public class Komplex {
    double realTal;
    double i;
    public Komplex(double v, double v1) {
    realTal = v;
    i = v1;

    }

    @Override
    public String toString() {
        return realTal + " + " + i +"i:";
    }

    public Komplex add(Komplex b) {
        Komplex l = new Komplex(b.realTal + realTal,b.i + i);
        return (l);
    }

    // (3.0,2.0) (4.0,1.0)
    public Komplex multiply(Komplex b) {
        Komplex l = new Komplex((realTal * b.realTal) - (i * b.i),(realTal * b.i) + (i * b.realTal));
        return (l);
    }

    public double arg() {

    }
}

