public class MainFSI {
    public static void main(String[] args) {
        FIScorporation empleado1 = new FIScorporation();
        FIScorporation empleado2 = new FIScorporation();
        FIScorporation empleado3 = new FIScorporation();
        System.out.println("Empleado 1");
        empleado1.calcularSalario(7.50,35);
        System.out.println("Empleado 2");
        empleado2.calcularSalario(8.20,47);
        System.out.println("Empleado 3");
        empleado3.calcularSalario(10,73);
    }
}
