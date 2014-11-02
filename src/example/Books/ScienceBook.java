package example.Books;

import example.exceptions.buyException;
import example.exceptions.readException;
import example.interfaces.IBuy;

/**
 * Created by IuliS on 27.10.2014.
 */
public class ScienceBook extends Book implements IBuy {

    /**
     * basic constructor
     * @param title
     */
    public ScienceBook(String title)
    {
        super(title);
    }

    /**
     * initializes the book with title and the article where it was mentioned
     * @param title
     * @param article
     */
    public ScienceBook(String title, String article)
    {
        super(title + " "+article);
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
