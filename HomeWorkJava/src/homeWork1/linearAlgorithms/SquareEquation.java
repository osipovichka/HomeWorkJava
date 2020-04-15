package homeWork1.linearAlgorithms;

public class SquareEquation {
    //Найти корни квадратного уравнения. (ax2 + bx + c)
    public double calcDiscriminant(double a, double b, double c){
        double d = Math.pow(b, 2) - 4 * a * c;
        return d;
    }

    public double[] calcRoots(double a, double b, double c){
        double d = calcDiscriminant(a, b, c);
        double x1, x2;

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            return new double[] {x1, x2};

        } else if (d == 0) {
            x1 = (-b) / (2 * a);
            return new double[] {x1};
        }
        return new double[] {};
    }
}
