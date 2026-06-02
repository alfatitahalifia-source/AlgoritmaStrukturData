import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Dasar Pemrograman");
        Book book2 = new Book("7145", "Hafalan Shalat delisa");
        Book book3 = new Book("3562", "Muhammad Al-Fatih");

        Stack<Book> stack = new Stack<>();
        stack.push(book1);
        stack.push(book2);
        stack.push(book3);
        
        Book temp = stack.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }
        Book temp2 = stack.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }
        for (Book book : stack) {
            System.out.println(book.toString());
        }
        System.out.println(stack);
    }
}
