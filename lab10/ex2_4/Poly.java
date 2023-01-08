package lab10.ex2_4;

public interface Poly {
    int degree();
    Poly derivative();
    double coefficient(int degree);
    double[] coefficient();
}
