package lesson1;

public class Author {
    String author = "";

    public String getTitle() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void show() {
        System.out.println(this.author);
    }
}
