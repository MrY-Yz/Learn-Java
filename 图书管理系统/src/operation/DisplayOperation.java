package operation;

import book.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        for(int i =0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
        System.out.println("共计" + bookList.getSize() + "本书!");
    }
}
