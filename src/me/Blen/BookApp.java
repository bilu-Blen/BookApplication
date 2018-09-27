package me.Blen;

public class BookApp {
    public static void main(String[] args) {
        Book b = new Book();
        print(b.getAuthor());
        print(b.getTitle());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
