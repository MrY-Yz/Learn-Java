package user;

import book.BookList;
import operation.IOperation;

public abstract class User  {
    private String name;
    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
