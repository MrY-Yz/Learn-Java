package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");
        System.out.println("请输入要借阅的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (!book.getName().equals(name)) {
                continue;
            }
            if (book.isBorrowed()) {
                System.out.println("此书已经被借走了！");
            }
            book.setBorrowed(true);
        }
    }
}
