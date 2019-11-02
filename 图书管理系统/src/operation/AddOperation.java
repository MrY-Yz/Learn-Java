package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要添加的书名：");
        String name = scanner.next();
        System.out.println("请输入作者名：");
        String author = scanner.next();
        System.out.println("请输入价格：");
        int price = scanner.nextInt();
        System.out.println("请输入书的类型：");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
        bookList.setBooks(bookList.getSize(),book);
        bookList.setSize(bookList.getSize() + 1);
    }
}
