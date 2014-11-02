package example.Books;

import example.exceptions.buyException;
import example.exceptions.readException;
import example.interfaces.IBuy;

/**
 * Created by IuliS on 01.11.2014.
 */
public class RomanceBook extends Book implements IBuy{
    /**
     * Simple Contructor : initializes only with the title of the book
     * @param title
     */
    public  RomanceBook(String title){
        super(title);
    }

    /**
     * Another constructor: initializes with title, type and author
     * @param title
     * @param type
     * @param author
     */
    public  RomanceBook(String title,String type, String author){
        super(title + " "+type + " "+author);
    }

    /**
     * Verifies if the author is popular(starts with Reid)
     * @param bookAuthor
     * @return
     */
    public boolean popularAuthor(String bookAuthor)
    {
        if(bookAuthor != null && bookAuthor.startsWith("Reid"))
            return true;
        return false;
    }
    /**
     * Method to borrow one book
     * @param bookname
     * @return
     */
    @Override
    public boolean borrowBook(String bookname) {
        if (bookname !=null ) return true;
        return false;
    }
    /**
     * Throw an error if the title of the book is null
     * @throws buyException
     */
    @Override
    public void buyBook() throws buyException {
        if(getTitle()==null)
            throw new buyException("The book does not exist!");
    }

    @Override
    public void read() throws readException {
        if(getTitle()==null)
            throw new readException("The book does not exist!");
    }
}
