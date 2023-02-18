package task_KR_1;

public class Main {
    static String[][] books;
    public static void main(String[] args) {
        books = new  String[][]{{"Маленький принц", "Анутуан де Сент-Экзюпери"}, {"Мастер и Маргарита", "Михаил Булгаков"}};
        showBooks();
    }
    public static void showBooks () {
        for (String[] line : books) {
            System.out.println("Название книги " + line[0] + ", автор " + line[1]);
        }
    }
}
