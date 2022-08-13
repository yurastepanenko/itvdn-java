package lesson1;

public class Book {
    public static void main(String[] args) {
        Title t = new Title();
        t.setTitle("Komar");
        t.show();

        Author a = new Author();
        a.setAuthor("Artem");
        a.show();

        Content c = new Content();
        c.setContent("interes");
        c.show();

    }
}
