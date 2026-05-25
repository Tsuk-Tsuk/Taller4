package Taller4;

public class Pelicula {

    // Atributos de la clase
    String nombre;
    String director;
    String genero;
    int duracion;
    int añoEstreno;
    double rating;

    // Constructor
    public Pelicula(String nombre, String director, String genero,
                    int duracion, int añoEstreno, double rating) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.añoEstreno = añoEstreno;
        this.rating = rating;
    }

    // Método para mostrar
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Genero: " + genero);
        System.out.println("Duracion: " + duracion + " min");
        System.out.println("Anio: " + añoEstreno);
        System.out.println("Rating: " + rating);
        System.out.println("----------------------------");
    }
}