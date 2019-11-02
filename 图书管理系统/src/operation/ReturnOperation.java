package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还书籍的名字：");
        String name = scanner.next();
        for(int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if(!book.getName().equals(name)) {
                continue;
            }
            if(!book.isBorrowed()) {
                System.out.println("此书已经被归还");
                break;
            }
            book.setBorrowed(false);
        }
    }
}
