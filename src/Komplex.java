import java.util.Objects;

public class Komplex {
    double realTal;
    double i;
    public Komplex(double v, double v1) {
    realTal = v;
    i = v1;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.realTal, realTal) == 0 && Double.compare(komplex.i, i) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(realTal, i);
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
    return (Math.atan(i/realTal));
    }
}

