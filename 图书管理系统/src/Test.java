import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while(true) {
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }

    public static User login() {
        System.out.println("请输入您的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请输入您的身份:(1.管理员  2.普通用户)");
        int role = scanner.nextInt();
        if(role == 1) {
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}
