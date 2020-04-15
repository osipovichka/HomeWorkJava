package homeWork1.linearAlgorithms;

public class EquationStraight {
    //Вывести уравнение прямой по координатам двух точек

    public double getK(double x1, double x2, double y1, double y2){
        double k = (y1 - y2) / (x1 - x2);
        return Math.round(k * 100d) / 100d;
    }

    public double getEquationStraight(double x1, double x2, double y1, double y2){
        double b = y2 - getK(x1, x2, y1, y2) * x2;
        return Math.round(b * 100d) / 100d;
    }
}
