public class GravityCalculator {
    public double a = -9.81;
    public double v0= 0;

    public double calcular(double t){
        return v0*t+((double) 1 /2)*a*Math.pow(t,2);
    }

}
