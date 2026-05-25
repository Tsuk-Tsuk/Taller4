public class Book {
    String title;
    boolean borrowed;

    public Book(String title) {
        this.title = title;
        borrowed = false;
    }

    public void borrow() {
        borrowed = true;
    }

    public void giveBack() {
        borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }
}