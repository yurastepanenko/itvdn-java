package lesson1;

public class Content {
    String content;

    public String getTitle() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    void show() {
        System.out.println(this.content);
    }
}
