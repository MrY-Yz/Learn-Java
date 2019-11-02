package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要删除的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int i = 0;
        for(; i < bookList.getSize(); i++) {
            if(name.equals(bookList.getBook(i).getName())) {
                break;
            }
        }
        if(i > bookList.getSize()){
            System.out.println("未找到此书！");
            return;
        }
        Book lastBook = bookList.getBook(bookList.getSize() - 1);
        bookList.setBooks(i,lastBook);
        bookList.setSize(bookList.getSize() - 1);
    }
}
