public class Maraton {
    String[] nombres = {
            "Elena", "Tomas", "Hamilton", "Susana", "Felipe", "Mateo",
            "Alex", "Emily", "Juan", "Jaime", "Janine", "Emma",
            "Daniel", "Nataly", "Aaron", "Katy"
    };
    int[] tiempos = {
            341, 273, 278, 329, 445, 402,
            388, 275, 243, 334, 412, 393,
            299, 343, 317, 265
    };

    public void mejoresTiempo(){
        int mejorTiempo = Integer.MAX_VALUE;
        int segundo = Integer.MAX_VALUE;
        String nombreMejor = "";
        String nombreSegundo = "";

        for (int i = 0; i < tiempos.length; i++) {

            if (tiempos[i] < mejorTiempo) {
                segundo = mejorTiempo;
                nombreSegundo = nombreMejor;

                mejorTiempo = tiempos[i];
                nombreMejor = nombres[i];

            } else if (tiempos[i] < segundo) {
                segundo = tiempos[i];
                nombreSegundo = nombres[i];
            }


        }
        int horas1 = mejorTiempo / 60;
        int minutos1 = mejorTiempo % 60;

        int horas2 = segundo / 60;
        int minutos2 = segundo % 60;
        System.out.println("Primer lugar: ");
        System.out.println(nombreMejor +" "+ horas1 + "h " + minutos1 + "min");

        System.out.println("Segundo lugar: ");
        System.out.println(nombreSegundo + " "+ horas2 + "h " + minutos2 + "min");

    }


    public static void main(String[] args) {
        Maraton maraton = new Maraton();
        maraton.mejoresTiempo();


    }

}
