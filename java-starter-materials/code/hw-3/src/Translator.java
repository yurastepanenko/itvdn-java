import java.util.Scanner;
public class Translator {
    public static void main(String[] args) {
        String userWord;
        String word1 = "cat";
        String word2 = "dog";
        String word3 = "table";
        String word4 = "select";
        String word5 = "update";
        String word6 = "delete";
        String word7 = "insert";
        String word8 = "snow";
        String word9 = "day";
        String word10 = "night";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        userWord = sc.next();

        switch (userWord){
            case "кот":
                System.out.println(word1);
                break;
            case "собака":
                System.out.println(word2);
                break;
            case "таблица":
                System.out.println(word3);
                break;
            case "вывести":
                System.out.println(word4);
                break;
            case "изменить":
                System.out.println(word5);
                break;
            case "удалить":
                System.out.println(word6);
                break;
            case "вставить":
                System.out.println(word7);
                break;
            case "снег":
                System.out.println(word8);
                break;
            case "день":
                System.out.println(word9);
                break;
            case "ночь":
                System.out.println(word10);
                break;
            default:
                System.out.println("Not word(((");
        }

    }
}
