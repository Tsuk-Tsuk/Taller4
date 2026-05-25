public class FIScorporation {
    public void calcularSalario(double salarioBase, int horasTrabajadas) {
        if (salarioBase < 8.00) {
            System.out.println("El salario base no puede ser menor a 8$");
            return;
        }
        if (horasTrabajadas > 60) {
            System.out.println("Las horas trabajadas no pueden ser mayores a 60");
            return;
        }
        double salarioTotal;
        if (horasTrabajadas <= 40) {
            salarioTotal = salarioBase * horasTrabajadas;
        } else {
            int horasExtras = horasTrabajadas - 40;
            salarioTotal = (salarioBase * 40) + (horasExtras * salarioBase * 1.5);
        }
        System.out.println("Salario total: " + salarioTotal+"$");
    }


}