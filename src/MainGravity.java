import java.util.Scanner;

public class MainGravity {
    public static void main(String[] args) {
        GravityCalculator calculo = new GravityCalculator();
        Scanner sc   = new Scanner(System.in);
        double t;
        System.out.printf("Ingrese el tiempo: ");
        t = sc.nextDouble();
        System.out.println("La distancia es: "+calculo.calcular(t)+"m");
    }
}