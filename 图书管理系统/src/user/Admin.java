package user;

import book.BookList;
import jdk.dynalink.Operation;
import operation.*;

import javax.naming.Name;
import java.awt.*;
import java.util.Scanner;

public class Admin extends User {
     public Admin(String name) {
         super(name);
         operations = new IOperation[] {
                 new ExitOperation(),
                 new AddOperation(),
                 new DelOperation(),
                 new FindOperation(),
                 new DisplayOperation()
         };
     }

     @Override
     public int menu() {
         System.out.println("===================");
         System.out.println("hello " + super.getName());
         System.out.println("0.退出");
         System.out.println("1.增加图书");
         System.out.println("2.删除图书");
         System.out.println("3.查找图书");
         System.out.println("4.打印所有图书");
         System.out.println("请输入您的选择:");
         System.out.println("===================");
         Scanner scanner = new Scanner(System.in);
         int choice = scanner.nextInt();
         return choice;
     }

     @Override
     public void doOperation(int choice, BookList bookList) {
         super.doOperation(choice, bookList);
     }
 }
