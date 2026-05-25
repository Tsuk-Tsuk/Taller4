public class Library {

    String address;
    Book[] books = new Book[10];
    int count = 0;

    public Library(String address) {
        this.address = address;
    }

    public void addBook(Book b) {
        books[count] = b;
        count = count + 1;
    }

    public void showBooks() {
        for (int j = 0; j < count; j++) {
            if (books[j].isBorrowed() == false) {
                System.out.println(books[j].title);
            }
        }
    }

    public void borrowBook(String name) {

        boolean existe = false;

        for (int j = 0; j < count; j++) {

            if (books[j].title.equals(name)) {
                existe = true;

                if (books[j].isBorrowed() == false) {
                    books[j].borrow();
                    System.out.println("Prestado: " + name);
                } else {
                    System.out.println("Ya está prestado");
                }
            }
        }

        if (existe == false) {
            System.out.println("No existe ese libro");
        }
    }

    public void returnBook(String name) {

        boolean existe = false;

        for (int j = 0; j < count; j++) {

            if (books[j].title.equals(name)) {
                existe = true;

                books[j].giveBack();
                System.out.println("Devuelto: " + name);
            }
        }

        if (existe == false) {
            System.out.println("No existe ese libro");
        }
    }

    public void showAddress() {
        System.out.println(address);
    }

    public static void hours() {
        System.out.println("9:00 - 17:00");
    }
}