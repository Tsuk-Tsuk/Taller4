public class MainLibrary {
        public static void main(String[] args) {

            Library libro1 = new Library("Toledo y Madrid 455");
            Library libro2 = new Library("12 de Octubre y Carrion");

            libro1.addBook(new Book("El Señor de los Anillos"));
            libro1.addBook(new Book("El Principito"));

            System.out.println("Horario:");
            Library.hours();

            System.out.println("\nDirecciones:");
            libro1.showAddress();
            libro2.showAddress();

            System.out.println("\nPréstamo:");
            libro1.borrowBook("El Señor de los Anillos");
            libro1.borrowBook("El Señor de los Anillos");
            libro2.borrowBook("El Señor de los Anillos");

            System.out.println("\nDisponibles libro1:");
            libro1.showBooks();

            System.out.println("\nDevolucion:");
            libro1.returnBook("El Señor de los Anillos");

            System.out.println("\nDisponibles libro1:");
            libro1.showBooks();
        }
}
