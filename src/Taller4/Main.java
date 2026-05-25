package Taller4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creamos una lista simple de películas
        ArrayList<Pelicula> lista = new ArrayList<>();

        // Agregamos películas manualmente
        lista.add(new Pelicula("Interstellar", "Christopher Nolan", "Ciencia Ficcion", 169, 2014, 9.0));
        lista.add(new Pelicula("Titanic",       "James Cameron",     "Romance",         195, 1997, 8.5));
        lista.add(new Pelicula("Avatar",        "James Cameron",     "Ciencia Ficcion", 162, 2009, 8.7));

        System.out.println("=== Ingrese una nueva pelicula ===");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Director: ");
        String director = sc.nextLine();

        System.out.print("Genero: ");
        String genero = sc.nextLine();

        System.out.print("Duracion (min): ");
        int duracion = Integer.parseInt(sc.nextLine());

        System.out.print("Año de estreno: ");
        int anio = Integer.parseInt(sc.nextLine());

        System.out.print("Rating: ");
        double rating = Double.parseDouble(sc.nextLine());

        // Creamos la nueva película y la agregamos a la lista
        Pelicula nueva = new Pelicula(nombre, director, genero, duracion, anio, rating);
        lista.add(nueva);

        System.out.println("\n=== Lista de peliculas ===");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).mostrar();
        }

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j).duracion > lista.get(j + 1).duracion) {
                    Pelicula temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }

        System.out.println("=== Peliculas ordenadas por duracion ===");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).mostrar();
        }

        System.out.print("Ingrese el nombre de la pelicula a buscar: ");
        String buscar = sc.nextLine();

        boolean encontrada = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).nombre.equalsIgnoreCase(buscar)) {
                System.out.println("\nPelicula encontrada:");
                lista.get(i).mostrar();
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("Pelicula no encontrada.");
        }

        sc.close();
    }
}