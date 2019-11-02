package book;

import java.util.Arrays;

public class BookList {
    private Book[] books = new Book[100];
    private int size = 0;

    public BookList() {
        books[0] = new Book("Java编程思想","AUT",599,"学习");
        books[1] = new Book("Java核心卷一","BUT",123,"学习");
        books[2] = new Book("剑指offer","CUT",150,"学习");
        this.size = 3;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBooks(int pos, Book book) {
        books[pos] = book;
    }

}
