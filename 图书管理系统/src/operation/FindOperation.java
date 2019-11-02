package operation;

import book.Book;
import book.BookList;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要查找的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int count = 0;
        for(int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println(book);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("未找到此书");
        } else {
            System.out.println("共计找到" + count +"本书");
        }
    }
}
